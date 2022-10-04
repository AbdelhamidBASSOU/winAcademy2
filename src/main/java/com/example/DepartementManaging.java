package com.example;
import java.util.LinkedList;
import java.util.Scanner;

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

	
	
	public Departement findRecord(int idNumber)
	{

		// Iterate Record list
		// using for each loop
		for (Departement l : list) {

			// Checking record by id Number.
			if (l.getId_Dep() == idNumber) {
				return l;
			}
		}

		return null;
	}

	

	
	public void displayD()
	{

		
		if (list.isEmpty()) {

		
			System.out.println("The list has no records\n");
		}

		for (Departement record : list) {

			System.out.println(record.toString());
		}
	}
	public void deleteDep(int id_Dep)
    {
        Departement recordDel = null;
 
        
        for (Departement ll : list) {
 
           
            if (ll.getId_Dep() == id_Dep) {
                recordDel = ll;
            }
        }
		
        if (recordDel == null) {
 
           
            System.out.println("Invalid record Id");
        }
        else {
 
            list.remove(recordDel);
 
            System.out.println(
                "Successfully removed record from the list");
        }
    }
	public void update(int id, Scanner input)
    {
 
        if (findD(id)) {
            Departement rec = findRecord(id);
 
         
            System.out.print("What is the new Departement id Number ? ");
            int id_Dep = input.nextInt();        
            System.out.print(  "What is the new name of the departement ");
            String nom = input.next();
		    System.out.print("what is the new id college that exist in the departement ");
			int id_College = input.nextInt();
			 	
            
 
            rec.setId_Dep(id_Dep);
            rec.setNom(nom);
			rec.setId_College(id_College);
			
           
            System.out.println(
                "Record Updated Successfully");
        }
        else {
 
            
            System.out.println(
                "Record Not Found in the Student list");
        }
    }


}
