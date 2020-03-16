package com.pruebaGt.apiRest.service;

import java.util.List;

import com.pruebaGt.apiRest.entity.Words;

public interface WordsService {

	public Words saveWords(String lowerWord);
	
	public List<Words> getAllWords();
	
	
}
