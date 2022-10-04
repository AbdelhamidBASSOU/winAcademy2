package com.example;
import java.util.LinkedList;
import java.util.Scanner;


public class TeacherManaging {
	LinkedList<Enseignant> list;

	
	public TeacherManaging()
	{
		list = new LinkedList<>();
	}

	


	
	public void addT(Enseignant record)
	{

	
		if (!findT(record.getId_User())) {
			list.add(record);
		}
		else {

		
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	


	public boolean findT(int id_User)
	{

		
		for (Enseignant l : list) {

			
			if (l.getId_User() == id_User) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	
	
	public Enseignant findRecord(int idNumber)
	{

		for (Enseignant l : list) {

		
			if (l.getId_User() == idNumber) {
				return l;
			}
		}

		return null;
	}

	

	
	public void displayT()
	{

		
		if (list.isEmpty()) {

		
			System.out.println("The list has no records\n");
		}

		for (Enseignant record : list) {

			System.out.println(record.toString());
		}
	}


	public void deleteTeacher(int id_User)
    {
        Enseignant recordDel = null;
 
        
        for (Enseignant ll : list) {
 
           
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
 
        if (findT(id)) {
            Enseignant rec = findRecord(id);
 
         
            System.out.print("What is the new Teacher id Number ? ");
            int id_User = input.nextInt();        
            System.out.print(  "What is the new Teacher last name");
            String nom = input.next();
		    System.out.print("what is the new Teacher first name ");
			String prenom = input.next();
			System.out.print("what is the Teacher new email");
			String mail = input.next();
			System.out.print("what is the Teacher new phone number");
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
			rec.setDate_Debut(date);
           
            System.out.println(
                "Record Updated Successfully");
        }
        else {
 
            
            System.out.println(
                "Record Not Found in the Student list");
        }
    }



}
