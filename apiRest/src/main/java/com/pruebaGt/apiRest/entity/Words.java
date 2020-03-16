package com.pruebaGt.apiRest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "words")
public class Words implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "lowerWord")
	private String lowerWord;
	
	@Column(name = "upperWord")
	private String upperWord;

	public Words() {
		super();
	}

	public Words(String lowerWord, String upperWord) {
		super();
		this.lowerWord = lowerWord;
		this.upperWord = upperWord;
	}

	public String getLowerWord() {
		return lowerWord;
	}

	public void setLowerWord(String lowerWord) {
		this.lowerWord = lowerWord;
	}

	public String getUpperWord() {
		return upperWord;
	}

	public void setUpperWord(String upperWord) {
		this.upperWord = upperWord;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Words [lowerWord=" + lowerWord + ", upperWord=" + upperWord + "]";
	}

}
