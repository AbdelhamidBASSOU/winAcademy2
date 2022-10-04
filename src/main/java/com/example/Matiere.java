package com.example;

public class Matiere {
    

    private int id_Matiere;
     private String Nom;



     public Matiere(){}




     public Matiere(int id_Matiere,String Nom){
 
 
        
         this.id_Matiere=id_Matiere;
         this.Nom=Nom;
 
 
     }


    public int getId_Matiere() {
        return id_Matiere;
    }




    public void setId_Matiere(int id_Matiere) {
        this.id_Matiere = id_Matiere;
    }




    public String getNom() {
        return Nom;
    }




    public void setNom(String nom) {
        Nom = nom;
    }










    public String toString()
    {
    
        // Returning the record
        return "Matiere{"
            + ", id_Matiere=" + id_Matiere
            + ",Nom=" + Nom + '}';
    }


    
}
