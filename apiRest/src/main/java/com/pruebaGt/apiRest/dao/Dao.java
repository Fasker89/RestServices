package com.pruebaGt.apiRest.dao;

import java.util.List;

import com.pruebaGt.apiRest.entity.Words;

public interface Dao {

	/**
	 * Guarda las palabras en minusculas y masyusculas
	 * @param words
	 */
	public void insert(Words words);
	
	/**
	 * Muestra las palabras almacenadas
	 * @return
	 */
	public List<Words> findAll();
	
	
}
