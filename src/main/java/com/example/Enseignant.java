package com.example;

public class Enseignant extends User {

    private String date_Debut ;
    

    public Enseignant(){}
    
    public Enseignant(int id_User, String Nom, String Prenom, String Mail, String tel, boolean is_Active,int id_Role,String date_Debut) {
        // super(id_User, Nom, Prenom, Mail, tel, is_Active);

        this.id_User = id_User;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Mail = Mail;
        this.tel = tel;
        this.is_Active = is_Active;
        this.id_Role=id_Role;
        this.date_Debut = date_Debut;

    }
    

    public String getDate_Debut() {
        return date_Debut;
    }

    public void setDate_Debut(String date_Debut) {
        this.date_Debut = date_Debut;
    }

    
    @Override public String toString()
    {
 
        return "Enseignant{"
            + "id_User=" + id_User + ", Nom=" + Nom
            + ", Prenom=" + Prenom + ", Mail=" + Mail + ", tel=" + tel + 
            ", is_Active=" + is_Active +", id_Role=" + id_Role + ", date_Debut=" + date_Debut +'}';
    }
}
