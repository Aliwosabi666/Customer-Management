package com.example.customermanagement.classes;

public class Actions {
    private int id_action;
    private int id_opportunite;
    private String date;
    private String objet;

    public Actions() {
    }


    public int getId_action() {
        return id_action;
    }

    public void setId_action(int id_action) {
        this.id_action = id_action;
    }

    public int getId_opportunite() {
        return id_opportunite;
    }

    public void setId_opportunite(int id_opportunite) {
        this.id_opportunite = id_opportunite;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public Actions(int id_action, int id_opportunite, String date, String objet) {
        this.id_action = id_action;
        this.id_opportunite = id_opportunite;
        this.date = date;
        this.objet = objet;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "id_action=" + id_action +
                ", id_opportunite=" + id_opportunite +
                ", date='" + date + '\'' +
                ", objet='" + objet + '\'' +
                '}';
    }
}
