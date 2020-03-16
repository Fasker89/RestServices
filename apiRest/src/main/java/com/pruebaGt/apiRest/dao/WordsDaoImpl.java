package com.pruebaGt.apiRest.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pruebaGt.apiRest.entity.Words;

@Repository
public class WordsDaoImpl implements Dao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insert(Words words) {
		Transaction transaction = null;

		Session session = entityManager.unwrap(Session.class);
		transaction = session.beginTransaction();
		Query query = session.createNativeQuery("INSERT INTO words (Id, lowerWord, upperWord) VALUES (?, ?, ?)");
		query.setParameter(1, words.getId());
		query.setParameter(2, words.getLowerWord());
		query.setParameter(3, words.getUpperWord());
		query.executeUpdate();
//		session.saveOrUpdate("words", Words.class);
		transaction.commit();
	}

	@Override
	public List<Words> findAll() {
		Session session = entityManager.unwrap(Session.class);
		Query<Words> query = session.createQuery("from Words", Words.class);
		List<Words> wordsList = new ArrayList<Words>();
		wordsList = query.getResultList();
		return wordsList;
	}

}
