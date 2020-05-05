package com.javabykiran.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.Operatordao;
import com.jbk.hibernate.Operator;

@Service
public class Operatorservice {

	
	@Autowired
	Operatordao operatordao;
	
	public ArrayList<Operator> loadoperator() {
		// TODO Auto-generated method stub
		System.out.println("op");
		return (ArrayList<Operator>)operatordao.loadoperatordao();
		
	}

}
