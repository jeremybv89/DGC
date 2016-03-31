/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgc.DAO;

import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;



public abstract class GenericDao<K, E> {


	/**
	 * @uml.property  name="entityClass"
	 */
	private Class<E> entityClass;

	@SuppressWarnings("unchecked")
	public GenericDao() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass()
				.getGenericSuperclass();
		this.entityClass = (Class<E>) genericSuperclass
				.getActualTypeArguments()[1];
	}

	

	public E persist(E entity) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();
		return entity;
		
	}

	public void delete(E entity) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
	}

	public E merge(E entity) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(entity);
        session.getTransaction().commit();
		return entity;
	}

		

	public void flush() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.flush();
	}

	@SuppressWarnings("unchecked")
	public E findById(K id) {
		E clase = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		clase = (E) session.get(entityClass, (Long) id);
		session.getTransaction().commit();
		return clase;

	}

	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<E> lista =  session.createQuery(
				"from " + this.entityClass.getCanonicalName()).list();
        session.getTransaction().commit();
		return lista;
	}

	public List<E> executeNamedQuery(String namedQuery,
			HashMap<String, Object> parameters) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.getNamedQuery(namedQuery);
		for (String parameter : parameters.keySet()) {
			if (parameters.get(parameter) instanceof List<?>) {
				query.setParameterList(parameter,
						(Collection<?>) parameters.get(parameter));
			} else {
				query.setParameter(parameter, parameters.get(parameter));
			}
		}
		@SuppressWarnings("unchecked")
		ArrayList<E> result = new ArrayList<E>((List<E>) query.list());
		session.getTransaction().commit();
		return result;
	}
	

	@SuppressWarnings("unchecked")
	public List<Object> createNativeQuery(String createdQuery)
			throws SQLException {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.createSQLQuery(createdQuery);

		List<Object> result = new ArrayList<Object>(
				(ArrayList<Object>) query.list());
		session.getTransaction().commit();
		return result;
	}
	
	
	public int ConsultarConsecutivo(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String result = "";
		String hql = "SELECT COUNT(*)+1 FROM "+ this.entityClass.getCanonicalName() ;
		Query query = session.createQuery(hql);
		result = query.uniqueResult()+"";		
		session.getTransaction().commit();
		return Integer.parseInt(result);
	}
}
