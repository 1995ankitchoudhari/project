package com.javabykiran.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javabykiran.service.LoginService;
import com.javabykiran.service.UserService;
import com.jbk.hibernate.Users;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login")
	public ModelAndView Login(@ModelAttribute Users user, HttpSession session) {
		System.out.println("user >>> " + user.getEmail());
		System.out.println("user >>> " + user.getPassword());
		System.out.println("login");
		ModelAndView mv = new ModelAndView();
		if (loginService.checkLogin(user)) {
			System.out.println(user.getName());
		session.setAttribute("name",user.getName());
			mv.setViewName("dashboard");
		} else {
			mv.addObject("msg", "your password wrong");
			mv.setViewName("login");
		}

		return mv;
	}

	@RequestMapping(value = "/loginpage")
	public String openLoginPage() {
		System.out.println("LoginPage");
		return "login";
	}
	@RequestMapping(value = "/logoutPage")
	public String openLogOutPage() {
		System.out.println("logoutpage");
		return "logout";
	}

}
