package com.mangesh.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

@org.springframework.stereotype.Repository
public class RepositoryX {


	
	public String add(Student s)
	{
		
//		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//			 Session session=factory.getCurrentSession();
		 SessionFactory sessionFactory;
		Configuration cfg = new Configuration()
				.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		Session session =sessionFactory.getCurrentSession();	
		Transaction transaction=session.getTransaction();
		transaction.begin();
		Student o= (Student) session.save(s);
		transaction.commit();
		return o.getName()+o.getId()+"Aded";
	}
	
}
