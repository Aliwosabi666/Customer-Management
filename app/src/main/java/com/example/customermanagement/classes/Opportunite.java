package com.example.customermanagement.classes;

public class Opportunite {
    private int id_opportunite;
    private String libelle_opportunite;
    private double revenu_espere;
    private double probabilite;
    private String date_fermeture;

    public Opportunite() {
    }

    public int getId_opportunite() {
        return id_opportunite;
    }

    public void setId_opportunite(int id_opportunite) {
        this.id_opportunite = id_opportunite;
    }

    public String getLibelle_opportunite() {
        return libelle_opportunite;
    }

    public void setLibelle_opportunite(String libelle_opportunite) {
        this.libelle_opportunite = libelle_opportunite;
    }

    public double getRevenu_espere() {
        return revenu_espere;
    }

    public void setRevenu_espere(double revenu_espere) {
        this.revenu_espere = revenu_espere;
    }

    public double getProbabilite() {
        return probabilite;
    }

    public void setProbabilite(double probabilite) {
        this.probabilite = probabilite;
    }

    public String getDate_fermeture() {
        return date_fermeture;
    }

    public void setDate_fermeture(String date_fermeture) {
        this.date_fermeture = date_fermeture;
    }

    public Opportunite(int id_opportunite, String libelle_opportunite, double revenu_espere, double probabilite, String date_fermeture) {
        this.id_opportunite = id_opportunite;
        this.libelle_opportunite = libelle_opportunite;
        this.revenu_espere = revenu_espere;
        this.probabilite = probabilite;
        this.date_fermeture = date_fermeture;
    }

    @Override
    public String toString() {
        return "Opportunite{" +
                "id_opportunite=" + id_opportunite +
                ", libelle_opportunite='" + libelle_opportunite + '\'' +
                ", revenu_espere=" + revenu_espere +
                ", probabilite=" + probabilite +
                ", date_fermeture='" + date_fermeture + '\'' +
                '}';
    }
}
