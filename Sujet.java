
package patterns;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe abstraite pour le sujet (Pattern Observer)
 */
public abstract class Sujet{
    private List<Observer> observateurs = new ArrayList<>();

    public void attacher(Observer obs) {
        observateurs.add(obs);
    }

    public void detacher(Observer obs) {
        observateurs.remove(obs);
    }

    public void notifier() {
        for (Observer obs : observateurs) {
            obs.update();
        }
    }
}

