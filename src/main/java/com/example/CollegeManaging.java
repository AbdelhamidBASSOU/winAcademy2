package com.example;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollegeManaging {
    
LinkedList<College>list;
public CollegeManaging()
	{
		 list = new LinkedList<>();
	}


	public void addCollege(College record)
	{

	
		if (!findCollege(record.getId_College())) {
			list.add(record);
		}
		else {

		
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	


	public boolean findCollege(int id_College)
	{

		
		for (College l : list) {

			
			if (l.getId_College() == id_College) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	
	// public void streamTest(){
	// 	List<College> CollegeWithActiveAccount = list.stream().filter(c -> c.isIs_Active() ).collect(Collectors.toList());
	// 	CollegeWithActiveAccount.forEach(Etud -> System.out.println(Etud.getNom()));

	// }

// public void getNom(){
// 	List <College> CollegeNom = list.stream().filter(i -> i.getDate_Com() ).collect(Collectors.toList());
// 	CollegeNom.forEach(e -> System.out.println(e.getId_Role()));
// }
	
	public College findRecord(int idNumber)
	{

		
		for (College l : list) {

			if (l.getId_College()== idNumber) {
				return l;
			}
		}

		return null;
	}

	

	
	public void displayCollege()
	{

		
		if (list.isEmpty()) {

		
			System.out.println("The list has no records\n");
		}

		for (College record : list) {

			System.out.println(record.toString());
		}
	}
	public void deleteCollege(int id_College)
    {
        College recordDel = null;
 
        
        for (College ll : list) {
 
           
            if (ll.getId_College() == id_College) {
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
 
        if (findCollege(id)) {
            College rec = findRecord(id);
 
         
            System.out.print("What is the new College id Number ? ");
            int id_College = input.nextInt();    
			System.out.print("what is the new name of the college");
			String Nom = input.next();	    
		    System.out.print("what is the new adresse id of the college ");
			int id_Adresse = input.nextInt();
			
            
 
            rec.setId_College(id_College);
			rec.setNom(Nom);
			rec.setId_Adresse(id_Adresse);
			
            System.out.println(
                "Record Updated Successfully");
        }
        else {
 
            
            System.out.println(
                "Record Not Found in the Student list");
        }
    }

	public void searchbyIdAdresse(int idAdress){
		List<College> collegeNames = list.stream().filter(College -> College.getId_Adresse()==(idAdress)).collect(Collectors.toList());
		collegeNames.forEach(College -> System.out.println(College.getNom()));
		} 

	
}
