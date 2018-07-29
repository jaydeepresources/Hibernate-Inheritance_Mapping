package com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;
import model.Programmer;
import model.Tester;

public class StoreEmployees {

	public static void main(String[] args) {

		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction tr = session.beginTransaction();

		// Employee e1 = new Employee("E-12221", "John Doe", 12345.6f);
		//
		// Programmer p1 = new Programmer("E-34564", "Janice Hall", 23365.6f,
		// "Java");
		//
		// Tester t1 = new Tester("E-34569", "Alex Dean", 33365.6f, "Manual");
		//
		// session.persist(e1);
		// session.persist(p1);
		// session.persist(t1);

		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		Iterator<Employee> iterator = list.iterator();

		while (iterator.hasNext()) {

			Employee emp = iterator.next();

			if (emp instanceof Employee) {

				System.out.println(emp);
			}

			if (emp instanceof Programmer) {
				Programmer p = (Programmer) emp;
				System.out.println(p);
			}

			if (emp instanceof Tester) {
				Tester t = (Tester) emp;
				System.out.println(t);
			}

		}

		tr.commit();
		session.close();
		System.out.println("saved");

	}

}
