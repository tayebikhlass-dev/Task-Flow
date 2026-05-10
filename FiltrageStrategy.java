package patterns;

import java.util.List;
import models.Tache;
/**
 * Interface pour la stratégie de filtrage (Pattern Strategy)
 */
public interface FiltrageStrategy {
    List<Tache> filtrer(List<Tache> taches);
}
