package com.wedding.persistence.service;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.data.jpa.repository.Query;

public class BaseDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Query(value = "?1")
	public List<Map<String,Object>> queryBySql(String sql) {
		Session session = entityManager.unwrap(org.hibernate.Session.class);
		org.hibernate.query.Query query = session.createQuery(sql);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map<String, Object>> result =  query.list();
		return result;
	}

}
