package controllers;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;

import models.Estudent;

public class UsuarioController {
	public String createUsuario(String name, String lastname, String email, String address, int age) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Estudent.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			Estudent estudiante = new Estudent(name, lastname, email, address, age);
			
			session.beginTransaction();
			
			session.persist(estudiante);
			
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Estudiante creado";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Error al registrar estudiante";
	}
	
	public String getUsuario(int id) {
		SessionFactory sessionFactory = new
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Estudent.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();

			Estudent estudiante = session.get(Estudent.class, id);

			session.getTransaction().commit();

			sessionFactory.close();

			return estudiante.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error el estudiante no existe";
	}
	
	public String updateUsuario(int id, String name) {
		SessionFactory sessionFactory = new
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Estudent.class).buildSessionFactory();

		Session session = sessionFactory.openSession();

		try {
			session.beginTransaction();

			Estudent estudiante = session.get(Estudent.class, id);

			estudiante.setName(name);

			session.saveOrUpdate(estudiante);

			session.getTransaction().commit();

			sessionFactory.close();

			return "Estudiante actualizado";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Error al actualizar estudiante";
	}
	
	public String deleteUsuario(int id) {
		SessionFactory sessionFactory = new 
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Estudent.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			
			Estudent estudiante = session.get(Estudent.class, id);
			
			session.remove(estudiante);
			
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Estudiante eliminado";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Error al eliinar estudiante";
	}
}
