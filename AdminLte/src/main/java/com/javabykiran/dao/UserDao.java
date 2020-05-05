package com.javabykiran.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Addnewuser;

@Repository
public class UserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Addnewuser> loadUser() {
		List<Addnewuser> listusers = (List<Addnewuser>) sessionFactory.openSession()
		.createCriteria(Addnewuser.class).list();
		return listusers;
	}

}
