package com.example;
import java.util.LinkedList;
// import java.util.Scanner;


public class TeacherManaging {
	LinkedList<Enseignant> list;

	
	public TeacherManaging()
	{
		list = new LinkedList<>();
	}

	


	
	public void add(Enseignant record)
	{

	
		if (!find(record.getId_User())) {
			list.add(record);
		}
		else {

		
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	


	public boolean find(int id_User)
	{

		
		for (Enseignant l : list) {

			
			if (l.getId_User() == id_User) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	
	
	// public Enseignant findRecord(int idNumber)
	// {

	// 	// Iterate Record list
	// 	// using for each loop
	// 	for (Enseignant l : list) {

	// 		// Checking record by id Number.
	// 		if (l.getId_User() == idNumber) {
	// 			return l;
	// 		}
	// 	}

	// 	return null;
	// }

	

	
	public void display()
	{

		
		if (list.isEmpty()) {

		
			System.out.println("The list has no records\n");
		}

		for (Enseignant record : list) {

			System.out.println(record.toString());
		}
	}
}
