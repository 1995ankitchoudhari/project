package com.javabykiran.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Operator;
@Repository
public class Operatordao {
	@Autowired 
	SessionFactory sessionFactory;

	public List<Operator> loadoperatordao(){
		
		@SuppressWarnings("unchecked")
		List<Operator> aa=(List<Operator>) sessionFactory.openSession()
				.createCriteria(Operator.class).list();
		System.out.println(aa);
		
		return aa;
		
		
	}

}
