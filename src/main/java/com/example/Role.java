package com.example;

public class Role {

private int id_Role;
private String Nom;
    
        public Role(int id_Role ,String Nom) {


            this.id_Role=id_Role;

            this.Nom=Nom;
    } 
        
        public int getId_Role() {
            return id_Role;
        }
        public void setId_Role(int id_Role) {
            this.id_Role = id_Role;
        }


        
        public String getNom() {
            return Nom;
        }
        public void setNom(String nom) {
            Nom = nom;
        }
 @Override
    public String toString() {
        return "Role{" +
                "id_Role=" + id_Role +
                ", Nom='" + Nom + ' ' +
                '}';
    }
}
