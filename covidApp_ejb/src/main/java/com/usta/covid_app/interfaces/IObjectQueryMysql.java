package com.usta.covid_app.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.covidapp_mysql.model.Login;

/**
 * Interfaz de tipo bean que se encarga de definir los métodos para realizar el
 * crud.
 * 
 * @author ALIX CHAPARRO
 * @param <T> tipo de objeto que recibe.
 */
@Remote
public interface IObjectQueryMysql<T> {

	/**
	 * metodo que se encarga de crear el objeto
	 * a persistir
	 * @param t
	 * @throws Exception
	 */
	public void create(T t) throws Exception;
	
	/**
	 * metodo encargado de buscar y listar todos los
	 * objetos de la consulta deseada 
	 * @return
	 * @throws Exception
	 */
	public List<T> findAll(Class<T> t) throws Exception;
	
	/**
	 * metodo de encotrar por el id el objeto buscado
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public T findById(Integer id, Class<T> object) throws Exception; 
	
	/**
	 * metodo par realizar cualquier cambio o modificacion 
	 * sobre un dato de un objeto
	 * @param t
	 * @throws Exception
	 */
	public void update(T t) throws Exception;
	
	
	/**
	 * elimina un objeto dependiendo el id que se solicite borrar
	 * @param id
	 * @throws Exception
	 */
	public void delete(Integer id, Class<T> object) throws Exception; 
	
	/**
	 * busca el usario segun credenciales
	 * @param user
	 * @param passwrod
	 * @return
	 * @throws Exception
	 */
	public T searchUser(String user, String password) throws Exception;
	
	/**
	 * recuperarmos contrasenia del usuario
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public T requiredPass(String user) throws Exception;

}