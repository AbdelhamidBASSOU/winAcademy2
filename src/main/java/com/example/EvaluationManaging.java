package com.example;
import java.util.LinkedList;
import java.util.Scanner;


public class EvaluationManaging {
    LinkedList<Evaluation>list;
    public EvaluationManaging()
        {
             list = new LinkedList<>();
        }
    
    
        public void addEvaluation(Evaluation record)
        {
    
        
            if (!findEvaluation(record.getId_Eval())) {
                list.add(record);
            }
            else {
    
            
                System.out.println(
                    "Record already exists in the Record list");
            }
        }
    
        
    
    
        public boolean findEvaluation(int id_Evaluation)
        {
    
            
            for (Evaluation l : list) {
    
                
                if (l.getId_Eval() == id_Evaluation) {
    
                    System.out.println(l);
                    return true;
                }
            }
            return false;
        }
    
        
        // public void streamTest(){
        // 	List<Evaluation> EvaluationWithActiveAccount = list.stream().filter(c -> c.isIs_Active() ).collect(Collectors.toList());
        // 	EvaluationWithActiveAccount.forEach(Etud -> System.out.println(Etud.getNom()));
    
        // }
    
    // public void getNom(){
    // 	List <Evaluation> EvaluationNom = list.stream().filter(i -> i.getDate_Com() ).collect(Collectors.toList());
    // 	EvaluationNom.forEach(e -> System.out.println(e.getId_Role()));
    // }
        
        public Evaluation findRecord(int idNumber)
        {
    
        
            for (Evaluation l : list) {
    
            
                if (l.getId_Eval() == idNumber) {
                    return l;
                }
            }
    
            return null;
        }
    
        
    
        
        public void displayEvaluation()
        {
    
            
            if (list.isEmpty()) {
    
            
                System.out.println("The list has no records\n");
            }
    
            for (Evaluation record : list) {
    
                System.out.println(record.toString());
            }
        }
      
        public void deleteEvaluation(int id_Evaluation)
        {
            Evaluation recordDel = null;
     
            
            for (Evaluation ll : list) {
     
               
                if (ll.getId_Eval() == id_Evaluation) {
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
     
            if (findEvaluation(id)) {
                Evaluation rec = findRecord(id);
     
             
                System.out.print("What is the new Evaluation id Number ? ");
                int id_Evaluation = input.nextInt();        
                System.out.print("What is the new id_User of the evaluation");
                int id_User = input.nextInt();
                System.out.print("what is the new id_Matiere of the evaluation");
                int id_Matiere = input.nextInt();
                System.out.print("what is the new note/Score of the user in this evaluation");
                double Note=input.nextDouble();
               
                
     
                rec.setId_Eval(id_Evaluation);
                rec.setId_User(id_User);
                rec.setId_Matiere(id_Matiere);
                rec.setNote(Note);
               
                System.out.println(
                    "Record Updated Successfully");
            }
            else {
     
                
                System.out.println(
                    "Record Not Found in the Student list");
            }
        }
}
