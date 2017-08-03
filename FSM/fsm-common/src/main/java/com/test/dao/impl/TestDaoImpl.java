package com.test.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.bean.User;
import com.test.dao.TestDao;

@Repository
@Transactional
public class TestDaoImpl implements TestDao{

    /**
     * inject EntityManager by Spring
     * the EntityManager is shared
     */
	@PersistenceContext
    private EntityManager entityManager;
	
	
	@Override
	public List<User> findAllUser() {		
		List<User> result = entityManager.createQuery( "from User", User.class).getResultList();
		return result;
	}


	@Override
	public User findUserById(Integer id) {
        // NamedQuery: select User from User where userId = :id?
		User user = entityManager.createNamedQuery("get_user_by_id", User.class)
				                      .setParameter("id", id).getSingleResult();
				                      
		return user;
	}

	@Override
	public void addUser(User user) {
		
		
	}
}
