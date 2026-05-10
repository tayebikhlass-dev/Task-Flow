package models;

import java.util.Date;

/**
 * Classe représentant une Tâche dans le projet.
 */
public abstract class Tache {
    private int id;
    private String titre;
    private String description;
    private String statut;
    private Date dateEcheance;
    private Utilisateur responsable;

    public void changerStatut(String nouveauStatut) {
        this.statut = nouveauStatut;
    }

    public String getTitre() { return titre; }
}
