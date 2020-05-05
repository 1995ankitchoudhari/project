package com.javabykiran.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.Operatorservice;
import com.jbk.hibernate.Operator;



@Controller
public class OperatorController {
	@Autowired
	Operatorservice operatorservice;
	
	
	@RequestMapping("/operatorslink")
	public ModelAndView OperatorPage(@ModelAttribute Operator oo) {
		
		ModelAndView mm=new ModelAndView();
		List<Operator> al=operatorservice.loadoperator();
		mm.addObject("list", al);
		mm.setViewName("operators");
		return mm;
		
	}

}
