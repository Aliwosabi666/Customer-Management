package com.example.customermanagement.classes;

public class Utilisateur {
    private int id_utilisateur;
    private String nom;
    private String prenom;
    private String email;
    private String login;
    private String password;
    private String etat;

    public Utilisateur() {

    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Utilisateur(int id_utilisateur, String nom, String prenom, String email, String login, String password, String etat) {
        this.id_utilisateur = id_utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.login = login;
        this.password = password;
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id_utilisateur=" + id_utilisateur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", etat='" + etat + '\'' +
                '}';
    }
}
