package com.example.customermanagement.classes;

public class Statut {
    private int id_statut;
    private String nouveau;
    private String qalifie;
    private String proposition;
    private String gagne;
    private String perdu;
    private int id_utilisateur;

    public Statut() {
    }

    public int getId_statut() {
        return id_statut;
    }

    public void setId_statut(int id_statut) {
        this.id_statut = id_statut;
    }

    public String getNouveau() {
        return nouveau;
    }

    public void setNouveau(String nouveau) {
        this.nouveau = nouveau;
    }

    public String getQalifie() {
        return qalifie;
    }

    public void setQalifie(String qalifie) {
        this.qalifie = qalifie;
    }

    public String getProposition() {
        return proposition;
    }

    public void setProposition(String proposition) {
        this.proposition = proposition;
    }

    public String getGagne() {
        return gagne;
    }

    public void setGagne(String gagne) {
        this.gagne = gagne;
    }

    public String getPerdu() {
        return perdu;
    }

    public void setPerdu(String perdu) {
        this.perdu = perdu;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public Statut(int id_statut, String nouveau, String qalifie, String proposition, String gagne, String perdu, int id_utilisateur) {
        this.id_statut = id_statut;
        this.nouveau = nouveau;
        this.qalifie = qalifie;
        this.proposition = proposition;
        this.gagne = gagne;
        this.perdu = perdu;
        this.id_utilisateur = id_utilisateur;
    }

    @Override
    public String toString() {
        return "Statut{" +
                "id_statut=" + id_statut +
                ", nouveau='" + nouveau + '\'' +
                ", qalifie='" + qalifie + '\'' +
                ", proposition='" + proposition + '\'' +
                ", gagne='" + gagne + '\'' +
                ", perdu='" + perdu + '\'' +
                ", id_utilisateur=" + id_utilisateur +
                '}';
    }
}
