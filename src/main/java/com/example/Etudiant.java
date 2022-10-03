package com.example;

public class Etudiant extends User {

private String date_Com;


public Etudiant() {}

public Etudiant(int id_User, String Nom, String Prenom, String Mail, String tel, boolean is_Active, int id_Role, String date_Com) {
              
                
                this.id_User = id_User;
                this.Nom = Nom;
                this.Prenom = Prenom;
                this.Mail = Mail;
                this.tel = tel;
                this.is_Active = is_Active;      
                this.date_Com = date_Com;
    }


    public String getDate_Com() {
        return date_Com;
    }

    public void setDate_Com(String date_Com) {
        this.date_Com = date_Com;
    }



    @Override public String toString()
    {
 
        return "Etudiant{"
            + "id_User=" + id_User + ", Nom=" + Nom
            + ", Prenom=" + Prenom + ", Mail=" + Mail + ", tel=" + tel + 
            ", is_Active=" + is_Active +", id_Role=" + id_Role + ", date_Com=" + date_Com +'}';
    }
}
