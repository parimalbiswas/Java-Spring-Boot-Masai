package com.parimal.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo4
{

	public static void main(String[] args)
	{
		EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em1 = emf1.createEntityManager();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roll to give grace marks");
		int roll = scanner.nextInt();

		Student student = em1.find(Student.class, roll);

		if (student == null)
		{
			System.out.println("Student Does Not Exists");
		}
		else
		{
			System.out.println("Enter the grace Marks");
			int gmarks = scanner.nextInt();

			em1.getTransaction().begin();

			student.setMarks(student.getMarks() + gmarks);

			em1.getTransaction().commit();

			System.out.println("Grace Marks Added........");
		}
		em1.close();

		System.out.println("Done");

	}

}
