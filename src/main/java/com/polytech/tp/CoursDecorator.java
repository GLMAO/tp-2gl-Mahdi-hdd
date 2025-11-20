package com.polytech.tp;

public abstract class CoursDecorator implements ICours {
    protected ICours coursDecore;

    public CoursDecorator(ICours cours) {
        this.coursDecore = cours;
    }

    @Override
    public String getDescription() {
        return coursDecore.getDescription();
    }

    @Override
    public double getDuree() {
        return coursDecore.getDuree();
    }
}