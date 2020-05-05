package com.javabykiran.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.AddUserDao;
import com.jbk.hibernate.Addnewuser;
import com.jbk.hibernate.Country;
import com.jbk.hibernate.Statemaster;

@Service
public class AddUserService {
	
	@Autowired
	AddUserDao addUserDao;
	
	public Addnewuser addNewUser(Addnewuser newUser) {
		return addUserDao.getNewUser(newUser);
		
	}

	
	 public ArrayList<Statemaster> loadState(){
		 System.out.println("loadstate");
		 return (ArrayList<Statemaster>) addUserDao.loadState();
	 }
	

}
