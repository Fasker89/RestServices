package com.pruebaGt.apiRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaGt.apiRest.entity.Words;
import com.pruebaGt.apiRest.service.WordsServiceImpl;

@RestController
@RequestMapping("/api")
public class WordsController {

	@Autowired
	private WordsServiceImpl wordService;
	
	@GetMapping("/getWords")
	public List<Words> getAllWords(){
		return wordService.getAllWords();
	}
	
	@PostMapping("/addWord")
	public Words addWords(@RequestBody String lowerWord){
		return wordService.saveWords(lowerWord);
	}
	
	
}
