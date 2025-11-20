package com.polytech.tp;

public class TestDecoratorComplet {
    public static void main(String[] args) {
        // Cours de base
        ICours cours = new Cours("Génie Logiciel", "Mr Oussama", "D23", "Lundi", "8h00", false, "2A", true);

        System.out.println("1. Cours simple :");
        System.out.println(cours.getDescription());
        // → Cours de Génie Logiciel avec Mr Oussama (D23)

        // On ajoute les décorateurs un par un
        cours = new CoursEnLigne(cours);
        System.out.println("\n2. + En ligne :");
        System.out.println(cours.getDescription());
        // → ... (En ligne)

        cours = new CoursEnAnglais(cours);
        System.out.println("\n3. + En anglais :");
        System.out.println(cours.getDescription());
        // → ... (En ligne) (En anglais)

        cours = new CoursMagistral(cours);
        System.out.println("\n4. + Magistral :");
        System.out.println(cours.getDescription());
        // → Cours de Génie Logiciel avec Mr Oussama (D23) (En ligne) (En anglais) (Magistral)

        System.out.println("\nDécorateurs cumulables = MISSION RÉUSSIE !");
    }
}
