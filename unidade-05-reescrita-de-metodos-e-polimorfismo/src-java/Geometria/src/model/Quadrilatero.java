package model;

public class Quadrilatero extends FigurasGeometricas{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;
    public Quadrilatero(String cor, double ladoA, double ladoB, double ladoC, double ladoD){
        super(cor);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    @Override
    public double getPerimetro() {
        return ladoA + ladoB + ladoC + ladoD;
    }
}
