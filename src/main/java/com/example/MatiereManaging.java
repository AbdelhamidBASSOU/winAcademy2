package com.example;
import java.util.LinkedList;
import java.util.Scanner;

public class MatiereManaging {
    LinkedList<Matiere>list;
public MatiereManaging()
	{
		 list = new LinkedList<>();
	}


	public void addMatiere(Matiere record)
	{

	
		if (!findMatiere(record.getId_Matiere())) {
			list.add(record);
		}
		else {

		
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	


	public boolean findMatiere(int id_Matiere)
	{

		
		for (Matiere l : list) {

			
			if (l.getId_Matiere() == id_Matiere) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	
	// public void streamTest(){
	// 	List<Matiere> MatiereWithActiveAccount = list.stream().filter(c -> c.isIs_Active() ).collect(Collectors.toList());
	// 	MatiereWithActiveAccount.forEach(Etud -> System.out.println(Etud.getNom()));

	// }

// public void getNom(){
// 	List <Matiere> MatiereNom = list.stream().filter(i -> i.getDate_Com() ).collect(Collectors.toList());
// 	MatiereNom.forEach(e -> System.out.println(e.getId_Role()));
// }
	
	public Matiere findRecord(int idNumber)
	{

	
		for (Matiere l : list) {

		
			if (l.getId_Matiere() == idNumber) {
				return l;
			}
		}

		return null;
	}

	

	
	public void displayMatiere()
	{

		
		if (list.isEmpty()) {

		
			System.out.println("The list has no records\n");
		}

		for (Matiere record : list) {

			System.out.println(record.toString());
		}
	}
  
	public void deleteMatiere(int id_Matiere)
    {
        Matiere recordDel = null;
 
        
        for (Matiere ll : list) {
 
           
            if (ll.getId_Matiere() == id_Matiere) {
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
 
        if (findMatiere(id)) {
            Matiere rec = findRecord(id);
 
         
            System.out.print("What is the new Subject id Number ? ");
            int id_Matiere = input.nextInt();        
            System.out.print(  "What is the new name of the subject");
            String nom = input.next();
		   
            
 
            rec.setId_Matiere(id_Matiere);
            rec.setNom(nom);
			
           
            System.out.println(
                "Record Updated Successfully");
        }
        else {
 
            
            System.out.println(
                "Record Not Found in the Student list");
        }
    }

}
