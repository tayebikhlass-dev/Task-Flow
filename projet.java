package models;

import java.util.ArrayList;
import java.util.List;
import patterns.FiltrageStrategy;

/**
 * Gère un projet contenant des tâches
 */
public class projet {
    private int id;
    private String nom;
    private List<Utilisateur> membres = new ArrayList<>();
    private List<Tache> taches = new ArrayList<>();
    private FiltrageStrategy strategy;

    public void ajouterTache(Tache t) { taches.add(t); }

    public void setFilteringStrategy(FiltrageStrategy s) {
        this.strategy = s;
    }

    public List<Tache> appliquerFiltre() {
        if (strategy != null) {
            return strategy.filtrer(this.taches);
        }
        return taches;
    }
}