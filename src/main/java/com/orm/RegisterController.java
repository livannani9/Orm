package com.orm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orm.model.User;

@Controller
public class RegisterController {

	/*@Autowired
	private SessionFactory factory;
	*/
	
	@Autowired
	private HibernateTemplate templet;
	
	@RequestMapping(value="/reg")
	private String register(User user) {

		System.out.println("entrig");
		/*Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = configure.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		*/
		/*
		Session openSession = factory.openSession();
		openSession.save(user);
		*/
		
		templet.save(user);
		System.out.println("exit");
		
		return "login";
	}
}
