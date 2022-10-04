package com.example;

public class Departement {
    private int id_Dep;
    private String Nom;
    private int id_College;
    
    public Departement() {}
    public Departement(int id_Dep,String Nom,int id_College){
     this.id_Dep=id_Dep;
     this.Nom=Nom;
     this.id_College=id_College;
    }


    public int getId_Dep() {
        return id_Dep;
    }
    public void setId_Dep(int id_Dep) {
        this.id_Dep = id_Dep;
    }


    
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }

    
    
    public int getId_College() {
        return id_College;
    }
    public void setId_College(int id_College) {
        this.id_College = id_College;
    }
    
    public String toString()
    {
    
        // Returning the record
        return "Departement{"
            + "id_Dep=" + id_Dep + ", Nom=" + Nom
            + ", id_College=" + id_College + '}';
    }

}
