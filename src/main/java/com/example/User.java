package com.example;

public abstract class User {
     
      protected int id_User;
      protected String Nom;
      protected String Prenom;
      protected String Mail;
      protected String tel;
      protected boolean is_Active;
      protected int id_Role;

    public User(){}

    public User(int id_User,String Nom, String Prenom,String Mail,String tel,boolean is_Active,int id_Role){
        this.id_User=id_User;
        this.Nom= Nom;
        this.Prenom=Prenom;
        this.Mail=Mail;
        this.tel=tel;
        this.is_Active=is_Active;
        this.id_Role=id_Role;
       }
    
    //  public void Login(){

    //  }
    //  public void consultaionEmp(){
        
    //  }

    public int getId_Role() {
        return id_Role;
     }

    public void setId_Role(int id_Role) {
        this.id_Role = id_Role;
    }
    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isIs_Active() {
        return is_Active;
    }

    public void setIs_Active(boolean is_Active) {
        this.is_Active = is_Active;
    }
//  public void speak(){
//     System.out.println("Iam " +this.Nom +  "and my mail is " + this.Mail );
//  }



 public String toString()
{

    // Returning the record
    return "User{"
        + "id_User=" + id_User + ", Nom=" + Nom
        + ", Prenom=" + Prenom + ", Mail=" + Mail + ", tel=" + tel + 
        ", is_Active=" + is_Active +", id_Role=" + id_Role + '}';
}



}
