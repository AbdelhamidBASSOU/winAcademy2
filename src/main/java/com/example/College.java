package com.example;

public class College {
       
      private int id_College;
      private String Nom;
      private int id_Adresse;


public College(){

}

      public College(int id_College,String Nom,int id_Adresse){

      }

      public int getId_College() {
        return id_College;
    }
    public void setId_College(int id_College) {
        this.id_College = id_College;
    }
   


      public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
  


    public int getId_Adresse() {
        return id_Adresse;
    }
    public void setId_Adresse(int id_Adresse) {
        this.id_Adresse = id_Adresse;
    }

 public String toString()
{

    // Returning the record
    return "College{"
        + "id_Colleger=" + id_College + ", Nom=" + Nom
        + ", id_Adresse=" + id_Adresse + '}';
}

}
