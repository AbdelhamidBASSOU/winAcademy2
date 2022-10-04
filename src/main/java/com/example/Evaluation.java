package com.example;

public class Evaluation {
    private int id_Eval;
    private int id_User;
    private int id_Matiere;
    private double Note;

public Evaluation(){}


   public Evaluation(int id_Eval,int id_User,int id_Matiere,double Note){
 
        this.id_Eval=id_Eval;
        this.id_User=id_User;
        this.id_Matiere=id_Matiere;
        this.Note=Note;

  }

    public int getId_Eval() {
        return id_Eval;
    }

    public void setId_Eval(int id_Eval) {
        this.id_Eval = id_Eval;
    }


    
    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }



    public int getId_Matiere() {
        return id_Matiere;
    }

    public void setId_Matiere(int id_Matiere) {
        this.id_Matiere = id_Matiere;
    }


    

   public double getNote() {
        return Note;
    }

    public void setNote(double note) {
        Note = note;
    }



    public String toString()
    {
    
        // Returning the record
        return "Evaluation{"+",id_Eval="+id_Eval 
            + ", id_Matiere=" + id_Matiere
            + ",id_User=" + id_User + ",Note=" + Note + '}';
    }


}
