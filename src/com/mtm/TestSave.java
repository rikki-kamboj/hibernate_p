package com.mtm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestSave {
	
	public static void main(String obj[]){
		
         Session s = HibernateUtil.getSessionFactory().openSession();
         
         Transaction t = s.beginTransaction();
         
         Employee emp=new Employee();
         emp.setFirstName("rakesh");
         emp.setLastName("kumar");
         
         Employee emp1=new Employee();
         emp1.setFirstName("rikki");
         emp1.setLastName("kamboj");
         
         List empList=new ArrayList();
         empList.add(emp);
         empList.add(emp1);
         
         Address a=new Address();
         a.setCity("fb");
         a.setState("HR");
         a.setCountry("IN");
         a.setEmployee(empList);
         
         
         Address a1=new Address();
         a1.setCity("tr");
         a1.setState("on");
         a1.setCountry("CA");
         a.setEmployee(empList);
         
         List ss=new ArrayList();
         ss.add(a);
         ss.add(a1);
         emp.setAddress(ss);
         
         s.save(emp);
         s.save(emp1);
         s.save(a);
         s.save(a1);
         t.commit();
         
	}
}
