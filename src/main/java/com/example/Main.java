package com.example;

import java.util.Scanner;


public class Main {

	
	public static void main(String[] args)
	{

		
		StudentManaging nrS = new StudentManaging();
		Etudiant recordS = new Etudiant();
		TeacherManaging nrT=new TeacherManaging();
		Enseignant recordT = new Enseignant();
		DepartementManaging nrD=new DepartementManaging();
		Departement recordD = new Departement();
	
		try (
        Scanner input = new Scanner(System.in)) {
           
            int option = 0;

            do {
                Menu();
                option = input.nextInt();
 
                switch (option) {
					case 1:
					int secondOption = 0;
						   addMenu();
						   secondOption = input.nextInt();
   
						   switch(secondOption){
								case 1:
											System.out.print("Entrer le numero de User : ");
											int id_S = input.nextInt();
			
											System.out.print("Entrez le prenom d'etudiant : ");
											String NomS = input.next();
			
											System.out.print("Entrez le nom de famille : ");
											String PrenomS = input.next();
			
											System.out.print("Entrer l'email de l'etudiant :");
											String MailS = input.next();
			
											System.out.print("entrer le numéro tél de l'etudiant : ");
											String telS = input.next();
			
											System.out.print("Est-ce-que ce compte est active : ");
											boolean is_ActiveS= input.nextBoolean();
			
											System.out.print("entrer le numero du role : ");
											int id_RoleS = input.nextInt();
			
											System.out.print("L'Etudiant à commencer à quelle date : ");
											String date_ComS = input.next();
			
											System.out.print("");
									
			
											recordS  = new Etudiant(id_S,NomS,PrenomS,MailS,telS,is_ActiveS,id_RoleS,date_ComS);
											nrS.addS(recordS);
											System.out.println(recordS.toString());
													break;


					  		    case 2:

								
										   System.out.print("Entrer le numero de User : ");
										   int id_T = input.nextInt();
		   
										   System.out.print("Entrez le prenom de l'enseignant : ");
										   String NomT = input.next();
		   
										   System.out.print("Entrez le nom de famille de l'enseignant: ");
										   String PrenomT = input.next();
		   
										   System.out.print("Entrer l'email de l'enseignant :");
										   String MailT = input.next();
		   
										   System.out.print("entrer le numéro tél de l'enseignant : ");
										   String telT = input.next();
		   
										   System.out.print("Est-ce-que ce compte est active : ");
										   boolean is_ActiveT= input.nextBoolean();
		   
										   System.out.print("entrer le numero du role : ");
										   int id_RoleT = input.nextInt();
		   
										   System.out.print("L'Ensignant à commencer à quelle date : ");
										   String date_ComT = input.next();
		   
										   System.out.print("");
								
		   
										   recordT  = new Enseignant(id_T,NomT,PrenomT,MailT,telT,is_ActiveT,id_RoleT,date_ComT);
										   nrT.addT(recordT);
										   System.out.println(recordT.toString());
										   break;
							    case 3:
											System.out.println("entrer le id departement");
											int id_Dep=input.nextInt();

											System.out.println("entrer le nom du departement");
											String NomD = input.next();

											System.out.println("entrer le id du college");
											int id_College  = input.nextInt();

											recordD  = new Departement(id_Dep,NomD,id_College);
											nrD.addD(recordD);
											System.out.println(recordD.toString());
								break;
							    case 4:
										   Menu();
										   break;

						   }
				   case 2:
					int thirdOption =0;
					searchMenu();
				   thirdOption = input.nextInt();
   
				   switch(thirdOption){
								case 1:
					System.out.print(
						"What is the Student id ? ");
					int bookId = input.nextInt();

					if (!nrS.find(bookId)) {
						System.out.println(
							"Student id does not exist\n");
					}
					break;
								case 2:

					System.out.print(
						"What is the Teacher id ? ");
					int bookIdT	 = input.nextInt();

					if (!nrT.findT(bookIdT)) {
						System.out.println(
							"teacher id does not exist\n");
					}

					break;    
					            case 3:
								System.out.print(
									"What is the Student id ? ");
								int bookIdD = input.nextInt();
			
								if (!nrD.findD(bookIdD)) {
									System.out.println(
										"Student id does not exist\n");
								}
								break;
								case 4:
					Menu();
					break;

						}

					break;
				   case 3:
				   int fourthOption =0;
					dispMenu();
				   fourthOption = input.nextInt();
   
				   switch(fourthOption){
								case 1:
					nrS.displayS();
					break;
								case 2:

                    nrT.displayT();
					break;
				            	case 3:
					nrD. displayD();
					break;
								case 4:
					Menu();
					break;
				   }
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
        System.out.println("1: Add");
        System.out.println("2: Search ");
		System.out.print("3: Dispaly \n");
		System.out.println("4: Exit");
	

		System.out.println("Enter your selection");

    }
	
	public static void addMenu()

	{

		System.out.println("Add");
		System.out.println("1: Add Student");
		System.out.println("2: Add Teacher");
		System.out.println("3: Add D epartement");
		System.out.print("4: get back to the main menu\n");
		System.out.print("Enter your selection : ");
	}

	public static void searchMenu(){


       System.out.println("Search");
       System.out.println("1: Search student ");
       System.out.println("2: Search Teacher");
	   System.out.println("3: Search Departement");
	   System.out.print("4: get back to the main menu\n");
	   System.out.print("Enter your selection : ");

	}

	public static void dispMenu(){

		System.out.println("display");
		System.out.println("1: display students");
		System.out.println("2: dispaly Teachers");
		System.out.println("3: display Departement");
	
		System.out.print("4: get back to the main menu\n");


	}
}
