package com.example;

public class Salle {
    
     private int id_Salle;
     private int id_Dep;
     private int id_Matiere;
     private String Nom;
    public Salle(){}

    public Salle(int id_Salle,int id_Dep,int id_Matiere,String Nom){

                this.id_Salle=id_Salle;
                this.id_Dep=id_Dep;
                this.id_Matiere=id_Matiere;
                this.Nom=Nom;
    }
    
    public int getId_Salle() {
        return id_Salle;
    }
    public void setId_Salle(int id_Salle) {
        this.id_Salle = id_Salle;
    }
   
    public int getId_Dep() {
        return id_Dep;
    }
    public void setId_Dep(int id_Dep) {
        this.id_Dep = id_Dep;
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
        return "Salle{"
            + "id_Salle=" + id_Salle + ", id_Dep=" + id_Dep
            + ", id_Matiere=" + id_Matiere + ",Nom=" +Nom + '}';
    }

}
