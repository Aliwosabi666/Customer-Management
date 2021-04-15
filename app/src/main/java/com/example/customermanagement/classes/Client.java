package com.example.customermanagement.classes;

public class Client {
//    private int id_client;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String coor_gps;

    public Client() {

    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoor_gps() {
        return coor_gps;
    }

    public void setCoor_gps(String coor_gps) {
        this.coor_gps = coor_gps;
    }

    public Client(String nom, String prenom, String adresse, String email, String coor_gps) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.coor_gps = coor_gps;
    }
}
