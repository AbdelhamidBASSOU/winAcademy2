package com.example;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
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

	
	// public void streamTest(){
	// 	List<Etudiant> etudiantWithActiveAccount = list.stream().filter(c -> c.isIs_Active() ).collect(Collectors.toList());
	// 	etudiantWithActiveAccount.forEach(Etud -> System.out.println(Etud.getNom()));

	// }
	// public void getName(){

	// 	List<Etudiant> et = list.stream().filter(s -> s.getMail()).collect(Collectors.toList());
	// 	et.forEach(std ->System.out.println(std.getNom()));
	// }

// public void getNom(){
// 	List <Etudiant> etudiantNom = list.stream().filter(i -> i.getNom() ).collect(Collectors.toList());
// 	etudiantNom.forEach(e -> System.out.println(e.getId_Role()));
// }
	
	public Etudiant findRecord(int id_User)
	{

		// Iterate Record list
		// using for each loop
		for (Etudiant l : list) {

			// Checking record by id Number.
			if (l.getId_User() == id_User) {
				return l;
			}
		}

		return null;
	}

	

	
	public void displayS()
	{

		
		if (list.isEmpty()) {

		
			System.out.println("The list has no records\n");
		}

		for (Etudiant record : list) {

			System.out.println(record.toString());
		}
	}


	public void deleteStudent(int id_User)
    {
        Etudiant recordDel = null;
 
        
        for (Etudiant ll : list) {
 
           
            if (ll.getId_User() == id_User) {
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
 
        if (find(id)) {
            Etudiant rec = findRecord(id);
 
         
            System.out.print("What is the new Student id Number ? ");
            int id_User = input.nextInt();        
            System.out.print(  "What is the new Student last name");
            String nom = input.next();
		    System.out.print("what is the new student first name ");
			String prenom = input.next();
			System.out.print("what is the student new email");
			String mail = input.next();
			System.out.print("what is the student new phone number");
			String tel=input.next();
			System.out.print("what the account new status true/false ?");
			Boolean status=input.nextBoolean();	
			System.out.print("what is the new date of start");
			String date=input.next();	 	
            
 
            rec.setId_User(id_User);
            rec.setNom(nom);
			rec.setPrenom(prenom);
			rec.setMail(mail);
			rec.setTel(tel);
			rec.setIs_Active(status);
			rec.setDate_Com(date);
           
            System.out.println(
                "Record Updated Successfully");
        }
        else {
 
            
            System.out.println(
                "Record Not Found in the Student list");
        }
    }

}