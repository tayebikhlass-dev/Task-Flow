package patterns;
import models.Tache;
import models.TacheSimple;
/**
 * Classe abstraite pour la création de tâches (Factory Method)
 */
public abstract class CreateurTache {
    public abstract Tache factoryMethod();

    public void anOperation() {
        Tache t = factoryMethod();
        // Utiliser la tache
    }
}

/**
 * Implémentation concrète de la fabrique
 */
public class FabriqueSimple extends CreateurTache {
    @Override
    public Tache factoryMethod() {
        return new TacheSimple(); // TacheSimple doit hériter de Tache
    }
}