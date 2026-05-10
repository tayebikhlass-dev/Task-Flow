package test;

import models.Projet;
import models.Utilisateur;
import patterns.FabriqueSimple;
import patterns.NotificationService;

/**
 * Classe principale pour tester le fonctionnement du projet
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("--- Démarrage du Test TaskFlow ---");

        // 1. Tester le Singleton (Notification)
        NotificationService logger = NotificationService.getInstance();
        logger.envoyerNotification("Application démarrée avec succès.");

        // 2. Tester la Factory (Création de tâche)
        FabriqueSimple fabrique = new FabriqueSimple();
        models.Tache maTache = fabrique.factoryMethod();
        System.out.println("Tâche créée via Factory.");

        // 3. Tester l'Observer
        Utilisateur user1 = new Utilisateur();
        user1.setNom("Ahmed");

        // Simulation d'un projet
        Projet p = new Projet();
        // ... Ajouter logique de test

        System.out.println("--- Test terminé ---");
    }
