package com.usta.covid_app.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.covidapp_mysql.model.Login;
import com.usta.covid_app.interfaces.IObjectQueryMysql;

/**
 * 
 * @author ALIX CHAPARRO
 *
 */

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DaoObjectMySql<T> implements IObjectQueryMysql<T> {

	@PersistenceContext(unitName = "covid_app_mysql") // aqui defino a que motor de base de datos voy a trabajar
	EntityManager mysqlEntity;// define los metodos que permiten hacer las transacciones

	@Override
	public void create(T t) throws Exception {
		mysqlEntity.persist(t);
	}

	@Override
	public List<T> findAll(Class<T> t) throws Exception {
		List<T> object = new ArrayList<T>();
		Query querySql = mysqlEntity.createNamedQuery(t.getSimpleName() + ".FIND_ALL");// Armo la consulta
		object = querySql.getResultList();// Trae los datos de la consulta
		return object;

	}

	@Override
	public T findById(Integer id, Class<T> object) throws Exception {
		T t = null;
		t = (T) mysqlEntity.find(object, id);
		return t;
	}

	@Override
	public void update(T t) throws Exception {
		mysqlEntity.merge(t);

	}

	@Override
	public void delete(Integer id, Class<T> object) throws Exception {
		T t = findById(id, object);
		if (t != null) {
			mysqlEntity.remove(t);
		}

	}

	@Override
	public T searchUser(String user, String password) throws Exception {
		T l = null;

		Query q = mysqlEntity.createNamedQuery(Login.FIND_USER_CREDENTIALS_MYSQL);
		q.setParameter("us", user);
		q.setParameter("ps", password);

		try {
			l = (T) q.getSingleResult();
		} catch (NoResultException e) {
			l = null;
		}

		return l;
	}

	@Override
	public T requiredPass(String user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
