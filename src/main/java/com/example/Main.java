package com.example;

// import java.util.Arrays;
// import java.util.List;
import java.util.Scanner;
// import java.util.stream.Collectors;


public class Main {

	
	public static void main(String[] args)
	{

		
		StudentManaging nrS = new StudentManaging();
		Etudiant recordS = new Etudiant();
		TeacherManaging nrT=new TeacherManaging();
		Enseignant recordT = new Enseignant();
		DepartementManaging nrD=new DepartementManaging();
		Departement recordD = new Departement();
		SalleManaging nrSalle = new SalleManaging();
		Salle recordSalle =new Salle();
		CollegeManaging nrCollege = new CollegeManaging();
		College recordCollege=new College();
	    MatiereManaging nrMat = new MatiereManaging();
		Matiere recordMat = new Matiere();
        // Etudiant Adam = new Etudiant(1,"Bakkar","Adam","ad@gmail.com","0674897643",true,1,"22-12-2021");
		// Etudiant Ahmed = new Etudiant(2,"Salim","Ahmed","ahm@gmail.com","067485432",true,1,"12-12-2021");




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

											System.out.print("");

											recordD  = new Departement(id_Dep,NomD,id_College);
											nrD.addD(recordD);
											System.out.println(recordD.toString());
								break;
								case 4:
                                            System.out.println("what is the classeroom id ?");
											int id_Salle=input.nextInt();

											System.out.print("what is the Departement that the classeroom follows id ?");
											int id_DepS=input.nextInt();

											System.out.println("what is the subject id ?");
											int id_Matiere=input.nextInt();
											
											System.out.println("what is the classeroom name ?");
											String NomSalle=input.next();

											System.out.print("");

											recordSalle=new Salle(id_Salle,id_DepS,id_Matiere,NomSalle);
											nrSalle.addSalle(recordSalle);
											System.out.println(recordSalle.toString());
								break;
								case 5:
										    System.out.println("what is the id of the college? ");
											int id_Colleg =input.nextInt();

											System.out.println("what is the name of the college ?");
											String NomC=input.next();

											System.out.println("what is the id of the adresse of the college ?");
											int id_AdresseC=input.nextInt();

											System.out.print("");

											recordCollege=new College(id_Colleg,NomC,id_AdresseC);
											nrCollege.addCollege(recordCollege);
											System.out.println(recordCollege.toString());

								break;
								case 6:
											System.out.println("what is the id of the subject");
											int id_Matier=input.nextInt();


											System.out.println("what is the name of the subject ");
											String Nom =input.next();

											recordMat = new Matiere(id_Matier, Nom);
											nrMat.addMatiere(recordMat);
											System.out.println(recordMat.toString());
								break;
							    
								case 7:
										   Menu();
										   break;

						   }
				  break;
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
									"What is the Departement id ? ");
								int bookIdD = input.nextInt();
			
								if (!nrD.findD(bookIdD)) {
									System.out.println(
										"Student id does not exist\n");
								}
								break;
								case 4:
								System.out.print(
									"What is the classeroom id ? ");
								int bookIdSalle = input.nextInt();
			
								if (!nrSalle.findSalle(bookIdSalle)) {
									System.out.println(
										"Student id does not exist\n");
								}
								break;
								case 5:
                            	System.out.print(
						"What is the College id ? ");
					int bookIdCollege = input.nextInt();

					if (!nrCollege.findCollege(bookIdCollege)) {
						System.out.println(
							"Student id does not exist\n");
					}
								break;
								case 6:
								System.out.print(
									"What is the Matiere id ? ");
								int bookIdMat = input.nextInt();
			
								if (!nrMat.findMatiere(bookIdMat)) {
									System.out.println(
										"Student id does not exist\n");
								}
								break;
								case 7:
								System.out.print("Enter id adresse");
								int idAd= input.nextInt();
									nrCollege.searchbyIdAdresse(idAd);
								break;
								case 8:
								System.out.print("Enter id adresse");
								int idCol= input.nextInt();
									nrD.searchbyIdCollege(idCol);
								break;
								case 9:
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
        		    nrSalle.displaySalle();
					break;

                                case 5:
					nrCollege.displayCollege();
								break;
								case 6:
					nrMat.displayMatiere();
					break;
								case 7:
					Menu();
					break;
				   }
				   break;
			    	case 4:
				int fifthOption=0;
				deleteMenu();
				fifthOption= input.nextInt();
				switch(fifthOption){

       				            case 1:
				System.out.print(
                    "What is the Student id number ? ");
                int rId = input.nextInt();
 
                nrS.deleteStudent(rId);
 
				           break;
						        case 2:
						   System.out.print(
							"What is the teacher id number ? ");
						int TId = input.nextInt();
		 
						nrT.deleteTeacher(TId);
						   break;
					        	case 3:
								System.out.print(
									"What is the departement id number ? ");
								int DId = input.nextInt();
				 
								nrD.deleteDep(DId);
						break;
                        
								case 4:
		            	System.out.print(
									"What is the classeroom id number ? ");
								int SalleId = input.nextInt();
				 
								nrSalle.deleteSalle(SalleId);
			break;
								case 5:
								System.out.print(
									"What is the college id number ? ");
								int CId = input.nextInt();
				 
								nrCollege.deleteCollege(CId);
		                   	break;
								case 6:
							System.out.print(
								"What is the Matiere id number ? ");
							int MId = input.nextInt();
			 
							nrMat.deleteMatiere(MId);
							break;
							    case 7:
							   Menu();
							   break;
			}
		  		   break;
				   case 5:
				   int sixthOption=0;
				   updateMenu();
				   sixthOption=input.nextInt();
				   switch(sixthOption){

								case 1:
								System.out.print(
									"What is the Student id number? ");
								int rIdNo = input.nextInt();
								nrS.update(rIdNo, input);
								break;
								case 2:
								System.out.print(
									"What is the Student id number? ");
								int rIdNoT = input.nextInt();
								nrT.update(rIdNoT, input);
								break;
								case 3:
								System.out.print(
									"What is the Student id number? ");
								int rIdNoD= input.nextInt();
								nrD.update(rIdNoD, input);
								break;
								case 4:
								System.out.print(
									"What is the Student id number? ");
								int rIdNoSalle= input.nextInt();
								nrSalle.update(rIdNoSalle, input);
								break;
								case 5:
								System.out.print(
									"What is the Student id number? ");
								int rIdNoCollege= input.nextInt();
								nrCollege.update(rIdNoCollege, input);
								break;
								case 6:
							  System.out.print(
								"What is the Student id number? ");
							int rIdNoMatiere= input.nextInt();
							nrMat.update(rIdNoMatiere, input);
							  break;
							    case 7:
							  Menu();
							  break;
				   }

				   break;
					case 6:

					
					System.out.println(
						"\nThank you for using the program. Goodbye!\n");
					System.exit(0);

					break;

				
				      default:
						System.out.println("\nInvalid input\n");
		            	break;
					
				}

			}
			while (option != 9);
		}
		
	}


    public static void Menu(){

        System.out.println("************Menu***************");
        System.out.println("1: Add");
        System.out.println("2: Search ");
		System.out.print("3: Dispaly \n");
		System.out.println("4: delete");
		System.out.println("5: update");
		System.out.println("6: Exit");
	

		System.out.println("Enter your selection");

    }
	
	public static void addMenu()

	{

		System.out.println(":::::::::::Add::::::::::");
		System.out.println("1: Add Student");
		System.out.println("2: Add Teacher");
		System.out.println("3: Add Departement");
		System.out.println("4: Add Salle");
		System.out.println("5: Add College");
		System.out.println("6: Add Matiere");
		System.out.print("7: get back to the main menu\n");
		System.out.print("Enter your selection : ");
	}

	public static void searchMenu(){


       System.out.println(":::::::::::Search:::::::::::");
       System.out.println("1: Search student ");
       System.out.println("2: Search Teacher");
	   System.out.println("3: Search Departement");
	   System.out.println("4: Search Salle");
	   System.out.println("5: Search College");
	   System.out.println("6: Search Matiere");
System.out.println("7: Search College by adresse id");
System.out.println("8: dearch departememnt by college id");
	   System.out.print("9: get back to the main menu\n");
	   System.out.print("Enter your selection : ");

	}

	public static void dispMenu(){

		System.out.println("::::::::::::::display:::::::::::::::");
		System.out.println("1: display students");
		System.out.println("2: dispaly Teachers");
		System.out.println("3: display Departements");
		System.out.println("4: dispaly Salles");
		System.out.println("5: dispaly Colleges");
		System.out.println("6: dispaly matieres");
		System.out.print("7: get back to the main menu\n");
		System.out.print("Enter your selection : ");


	}

   public static void deleteMenu(){

	System.out.println(":::::::::::::::delete:::::::::::::::");
	System.out.println("1: delete student");
	System.out.println("2: delete Teacher");
	System.out.println("3: delete Departement");
	System.out.println("4: delete Salle");
	System.out.println("5: delete College");
	System.out.println("6: delete Matiere");
	System.out.print("7: get back to the main menu\n");
	System.out.print("Enter your selection : ");
   }

   public static void updateMenu(){

	System.out.println(":::::::::::::::update:::::::::::::::");
	System.out.println("1: update student");
	System.out.println("2: update Teacher");
	System.out.println("3: update Departement");
	System.out.println("4: update Salle");
	System.out.println("5: update College");
	System.out.println("6: update Matiere");
	System.out.print("7: get back to the main menu\n");
	System.out.print("Enter your selection : ");
   }

}
