package services;
import models.Tache;

import models.Utilisateur;
import patterns.NotificationService;

/**
 * Service pour gérer les opérations sur les projets
 * (Niveau EST - Première année)
 */
public class ProjetService {

    /**
     * Méthode pour affecter une tâche à un utilisateur
     * @param t La tâche à affecter
     * @param u L'utilisateur responsable
     */
    public void affecterTache(Tache t, Utilisateur u) {
        // Logique pour lier la tâche à l'utilisateur
        System.out.println("Affectation de la tâche...");

        // Utilisation du Singleton pour notifier
        NotificationService.getInstance().envoyerNotification("Nouvelle tâche pour " + u.getNom());
    }

    public void creerNouveauProjet(String nom) {
        // Logique de création
    }
}