package model;

public enum Nivel {
    JUNIOR(500.0),
    PLENO(1000.0),
    SENIOR(1500.0);
    private final double bonus;

    Nivel(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus(){
        return this.bonus;
    }



}
