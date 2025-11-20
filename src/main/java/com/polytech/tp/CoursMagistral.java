package com.polytech.tp;

public class CoursMagistral extends CoursDecorator {

    public CoursMagistral(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecore.getDescription() + " (Magistral)";
    }
}