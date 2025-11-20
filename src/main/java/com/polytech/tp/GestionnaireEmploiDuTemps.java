package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {   // implements Subject

    private List<ICours> listeCours = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();   // liste des observateurs

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // (pas obligatoire de notifier ici, mais c'est bien)
        notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        System.out.println("Cours modifié : " + message);
        notifyObservers(message);
    }

    // Méthode exigée par le test TpTests (il l'appelle directement)
    public void setChangement(String string) {
        notifyObservers(string);      // c'est ici que le test attend la notification
    }

    // ---------- Méthodes de l'interface Subject ----------
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}