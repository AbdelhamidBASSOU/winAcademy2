package com.example;

public class Adresse {
     
    private int id_Adresse;
    private String Pay;
    private String Ville;
    private String code_Postale;

   public Adresse(){}


   public Adresse(int id_Adresse,String Pay,String Ville,String code_Postale){

    this.id_Adresse=id_Adresse;
    this.Pay=Pay;
    this.Ville=Ville;
    this.code_Postale=code_Postale;


   }


    public int getId_Adresse() {
        return id_Adresse;
    }
    public void setId_Adresse(int id_Adresse) {
        this.id_Adresse = id_Adresse;
    }

   
    public String getPay() {
        return Pay;
    }
    public void setPay(String pay) {
        Pay = pay;
    }

    

    public String getVille() {
        return Ville;
    }
    public void setVille(String ville) {
        Ville = ville;
    }

   
    
    public String getCode_Postale() {
        return code_Postale;
    }
    public void setCode_Postale(String code_Postale) {
        this.code_Postale = code_Postale;
    }

}
