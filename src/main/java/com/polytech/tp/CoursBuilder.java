package com.polytech.tp;

public class CoursBuilder {
    private String matiere;
    private String enseignant;
    private String salle = "Non définie";
    private String date = "À définir";
    private String heureDebut = "À définir";
    private boolean estOptionnel = false;
    private String niveau = "L3";
    private boolean necessiteProjecteur = false;

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public Cours build() {
        return new Cours(matiere, enseignant, salle, date, heureDebut, 
                        estOptionnel, niveau, necessiteProjecteur);
    }
}