package model;

public class Triangulo extends FigurasGeometricas{

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(String cor, double ladoA, double ladoB, double ladoC) {
        super(cor);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double getArea() {
        double p = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }

    @Override
    public double getPerimetro() {
        return this.ladoA + this.ladoB + this.ladoC;
    }
}
