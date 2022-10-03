package com.example;

import java.util.Scanner;


public class Main {

	
	public static void main(String[] args)
	{

		
		StudentManaging nr = new StudentManaging();
		Etudiant record = new Etudiant();
	
		try (
        Scanner input = new Scanner(System.in)) {
           
            int option = 0;

            do {
                Menu();
                option = input.nextInt();
 
                switch (option) {
                case 1:
                 int secondOption = 0;
                        sous_Menu1();
                        secondOption = input.nextInt();

                        switch(secondOption){
                             case 1:


					System.out.print(
						"What is the Student id Number ? ");

					int id_User = input.nextInt();

					
					System.out.print(
						"What is the Student last Name ? ");

					String Nom = input.next();
				
 
					System.out.print(
						"What is the Student first name ? ");

					String Prenom = input.next();

			        
					System.out.print(
						"What is the Student email? ");

					String Mail = input.next();

			         
					System.out.print(
						"What is the Student phone number? ");

					String Tel = input.next();

			         
					System.out.print(
						"is the account active? ");

					Boolean is_Active = input.nextBoolean();
			     

			        System.out.print(
			        "what is the student id_role ");

			        int id_Role = input.nextInt();
			    
			    
			        System.out.print(
			        "what is the student starting date");

			        String date_Com = input.next();
			    
			    
					
					record = new Etudiant(id_User,Nom,Prenom,Mail,Tel,is_Active,id_Role,date_Com);
					
					nr.add(record);
					System.out.println(record.toString());

					
					break;

				
				case 2:

					
					System.out.print(
						"What is the Student id ? ");
					int bookId = input.nextInt();

					if (!nr.find(bookId)) {
						System.out.println(
							"Student id does not exist\n");
					}

					break;

				
				case 3:
					nr.display();
					break;

				
				case 4:

					
					System.out.println(
						"\nThank you for using the program. Goodbye!\n");
					System.exit(0);

					break;

				
				default:

					System.out.println("\nInvalid input\n");
					break;
				}
			}

			
			while (option != 4);
		}
	}


    public static void Menu(){

        System.out.println("************Menu***************");
        System.out.println("1: Etudiant");
        System.out.println("2: Enseignant");
		System.out.println("Enter your selection");

    }
	
	public static void sous_Menu1()
	{

		System.out.println("Etudiant");
		System.out.println("1: Add Student");
		System.out.println("2: Search Student");
		System.out.println("3: Display Students");
		System.out.println("4: go back to main menu");
		System.out.print("Enter your selection : ");
	}
	public static void sous_Menu2(){


       System.out.println("Enseignant");
       System.out.println("1: Add Teacher");
       System.out.println("2: Search Teacher");
	   System.out.println("3: Display Teachers");
	   System.out.println("4: go back to main menu");
	   System.out.print("Enter your selection : ");


	}
}
