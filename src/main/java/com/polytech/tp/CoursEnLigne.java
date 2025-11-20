package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecore.getDescription() + " (En ligne)";
    }
}