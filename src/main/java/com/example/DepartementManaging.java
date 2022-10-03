package com.example;
import java.util.LinkedList;

public class DepartementManaging {
    
    LinkedList<Departement> list;

	
	public DepartementManaging()
	{
		list = new LinkedList<>();
	}

	


	
	public void addD(Departement record)
	{

	
		if (!findD(record.getId_Dep())) {
			list.add(record);
		}
		else {

		
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	


	public boolean findD(int id_Dep)
	{

		
		for (Departement l : list) {

			
			if (l.getId_Dep() == id_Dep) {

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

	

	
	public void displayD()
	{

		
		if (list.isEmpty()) {

		
			System.out.println("The list has no records\n");
		}

		for (Departement record : list) {

			System.out.println(record.toString());
		}
	}




}
