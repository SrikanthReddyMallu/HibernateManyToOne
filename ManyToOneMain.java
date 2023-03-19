package com.stu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ManyToOneMain 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//	Student student1=new Student();
//	student1.setName("srikkanth");
//	student1.setAge(20);
//	student1.setMarks(98);
//	student1.setGender("Male");
//	
//	Student student2=new Student();
//	student2.setName("sumanth");
//	student2.setAge(22);
//	student2.setMarks(96);
//	student2.setGender("Male");
//	
//	Student student3=new Student();
//	student3.setName("srikkanth");
//	student3.setAge(20);
//	student3.setMarks(98);
//	student3.setGender("Male");
//	
//	Student student4=new Student();
//	student4.setName("srikkanth");
//	student4.setAge(20);
//	student4.setMarks(98);
//	student4.setGender("Male");
//	
//	College college1=new College();
//	college1.setName("Narayana college");
//	college1.setWebsite("www.narayana.com");
//	college1.setLocation("Banaglore");
//	
//	College college2=new College();
//	college2.setName("chaitanya college");
//	college2.setWebsite("www.chaitanya.com");
//	college2.setLocation("chennai");
//	
//	student1.setColleges(college1);
//	student2.setColleges(college1);
//	
//	student3.setColleges(college2);
//	student4.setColleges(college2);
//	
//	entityTransaction.begin();
//	entityManager.persist(student1);
//	entityManager.persist(student2);
//	entityManager.persist(student3);
//	entityManager.persist(student4);
//	entityManager.persist(college1);
//	entityManager.persist(college2);
//	entityTransaction.commit();
	
	Student student=entityManager.find(Student.class,1);
	System.out.println(student.getName());
	System.out.println(student.getColleges().getLocation());
	
}
}
