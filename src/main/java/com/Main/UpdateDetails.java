package com.Main;

import com.entity.HotelReservation;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateDetails {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  HotelReservation hr = (HotelReservation)session.get(HotelReservation.class,49);
		  hr.setName("Sweety ");
		  hr.setAddress("Guragon ");
		  hr.setRoom_No(109);
		  
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();

	}

}
