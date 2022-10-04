package com.example;

import java.util.LinkedList;
import java.util.Scanner;

public class SalleManaging {
    
    LinkedList<Salle> list;

	
	public SalleManaging()
	{
		 list = new LinkedList<>();
	}




	public void addSalle(Salle recordSalle)
	{

	
		if (!findSalle(recordSalle.getId_Salle())) {
			list.add(recordSalle);
		}
		else {

		
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	


	public boolean findSalle(int id_Salle)
	{

		
		for (Salle l : list) {

			
			if (l.getId_Salle() == id_Salle) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	
	// public void streamTest(){
	// 	List<Salle> SalleWithActiveAccount = list.stream().filter(c -> c.isIs_Active() ).collect(Collectors.toList());
	// 	SalleWithActiveAccount.forEach(Etud -> System.out.println(Etud.getNom()));

	// }

// public void getNom(){
// 	List <Salle> SalleNom = list.stream().filter(i -> i.getDate_Com() ).collect(Collectors.toList());
// 	SalleNom.forEach(e -> System.out.println(e.getId_Role()));
// }
	
	public Salle findRecord(int idNumber)
	{

		// Iterate Record list
		// using for each loop
		for (Salle l : list) {

			// Checking record by id Number.
			if (l.getId_Salle() == idNumber) {
				return l;
			}
		}

		return null;
	}

	

	
	public void displaySalle()
	{

		
		if (list.isEmpty()) {

		
			System.out.println("The list has no records\n");
		}

		for (Salle record : list) {

			System.out.println(record.toString());
		}
	}

	public void deleteSalle(int id_Salle)
    {
        Salle recordDel = null;
 
        
        for (Salle ll : list) {
 
           
            if (ll.getId_Salle() == id_Salle) {
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
 
        if (findSalle(id)) {
            Salle rec = findRecord(id);
 
         
            System.out.print("What is the new Classeroom id Number ? ");
            int id_Salle = input.nextInt();        
            System.out.print(  "What is the new Departememnt id ");
            int id_Dep = input.nextInt();
		    System.out.print("what is the new Subject id ");
			int id_Matiere = input.nextInt();
			System.out.print("what is the new name of the classeroom");
			String Nom = input.next();	
            
 
            rec.setId_Salle(id_Salle);
            rec.setId_Dep(id_Dep);
			rec.setId_Matiere(id_Matiere);
			rec.setNom(Nom);
			
            System.out.println(
                "Record Updated Successfully");
        }
        else {
 
            
            System.out.println(
                "Record Not Found in the Student list");
        }
    }
}
