//package com.usta.covid_app.bean;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.ejb.LocalBean;
//import javax.ejb.Stateless;
//import javax.ejb.TransactionManagement;
//import javax.ejb.TransactionManagementType;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import com.covidapp_postgres.model.LoginPostgres;
//import com.usta.covid_app.interfaces.IObjectQueryMysql;
//import com.usta.covid_app.interfaces.IObjectQueryPostgres;
//
//@Stateless
//@LocalBean
//@TransactionManagement(TransactionManagementType.CONTAINER)
//public class DaoObjectPostgresql<T> implements IObjectQueryPostgres<T> {
//
//	@PersistenceContext(unitName = "covid_app_postgres")
//	EntityManager postgresEntity;
//
//	@Override
//	public void create(T t) throws Exception {
//		postgresEntity.persist(t);
//
//	}
//
//	@Override
//	public List<T> findAll(Class<T> t) throws Exception {
//		List<T> object = new ArrayList<T>();
//		Query querySql = postgresEntity.createNamedQuery(t.getSimpleName() + ".FIND_ALL");// Armo la consulta
//		object = querySql.getResultList();// Trae los datos de la consulta
//		return object;
//	}
//
//	@Override
//	public T findById(Integer id, Class<T> object) throws Exception {
//		T t = null;
//		// Opción 1
//		// Query q =
//		// postgresEntity.createNamedQuery(object.getSimpleName()+"FIND_BY_ID");
//		// q.setParameter("id", id );
//
//		// Opción 2
//		t = postgresEntity.find(object, id);
//		return t;
//	}
//
//	@Override
//	public void update(T t) throws Exception {
//		postgresEntity.merge(t);
//
//	}
//
//	@Override
//	public void delete(Integer id, Class<T> object) throws Exception {
//		T t = findById(id, object);
//		if (t != null) {
//			postgresEntity.remove(t);
//		}
//
//	}
//
//	@Override
//	public T searchUser(String user, String password) throws Exception {
//		T t = null;
//		try {
//			Query q = postgresEntity.createNamedQuery(LoginPostgres.FIND_USER_CREDENTIALS_POSTGRESQL);
//
//			q.setParameter("us", user);
//			q.setParameter("ps", password);
//
//			t = (T) q.getSingleResult();
//		} catch (Exception e) {
//			t = null;
//		}
//		return t;
//	}
//
//}
