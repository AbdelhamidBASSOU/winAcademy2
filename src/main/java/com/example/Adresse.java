package com.example;

public class Adresse {
     
    private int id_Adresse;

    public int getId_Adresse() {
        return id_Adresse;
    }
    public void setId_Adresse(int id_Adresse) {
        this.id_Adresse = id_Adresse;
    }

    private String Pay;

    public String getPay() {
        return Pay;
    }
    public void setPay(String pay) {
        Pay = pay;
    }

    private String Ville;

    public String getVille() {
        return Ville;
    }
    public void setVille(String ville) {
        Ville = ville;
    }

    private String code_Postale;
    
    public String getCode_Postale() {
        return code_Postale;
    }
    public void setCode_Postale(String code_Postale) {
        this.code_Postale = code_Postale;
    }

}
