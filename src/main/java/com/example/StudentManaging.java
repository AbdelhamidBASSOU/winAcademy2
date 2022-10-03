package com.example;
import java.util.LinkedList;
import java.util.List;
// import java.util.Scanner;
import java.util.stream.Collectors;


public class StudentManaging {
	LinkedList<Etudiant> list;

	
	public StudentManaging()
	{
		list = new LinkedList<>();
	}


	public void addS(Etudiant record)
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

		
		for (Etudiant l : list) {

			
			if (l.getId_User() == id_User) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	
	public static void streamTest(){
		List<Etudiant> etudiantWithActiveAccount = Etudiant.stream().filter(c -> c.isIs_Active() ).collect(Collectors.toList());
		etudiantWithActiveAccount.forEach(Etud -> System.out.println(Etud.getNom()));

	}
	
	// public Etudiant findRecord(int idNumber)
	// {

	// 	// Iterate Record list
	// 	// using for each loop
	// 	for (Etudiant l : list) {

	// 		// Checking record by id Number.
	// 		if (l.getId_User() == idNumber) {
	// 			return l;
	// 		}
	// 	}

	// 	return null;
	// }

	

	
	public void displayS()
	{

		
		if (list.isEmpty()) {

		
			System.out.println("The list has no records\n");
		}

		for (Etudiant record : list) {

			System.out.println(record.toString());
		}
	}
}
