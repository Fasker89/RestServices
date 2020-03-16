package com.pruebaGt.apiRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaGt.apiRest.dao.Dao;
import com.pruebaGt.apiRest.entity.Words;

@Service
public class WordsServiceImpl implements WordsService{

	@Autowired
	private Dao dao;
	
	@Override
	public Words saveWords(String lowerWord) {
		List<Words> wordsList = getAllWords();
		Words words = new Words();
		if(!lowerWord.isEmpty()) {
			words.setId(wordsList.size());
			words.setLowerWord(lowerWord);
			words.setUpperWord(lowerWord.toUpperCase());
			dao.insert(words);
		}
		return words;
	}

	@Override
	public List<Words> getAllWords() {
		List<Words> wordsList = dao.findAll();
		return wordsList;
	}

}
