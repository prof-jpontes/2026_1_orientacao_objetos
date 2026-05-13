package model;

public class Quadrilatero extends FigurasGeometricas{
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;
    protected double ladoD;
    public Quadrilatero(String cor, double ladoA, double ladoB, double ladoC, double ladoD){
        super(cor);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
        this.tipo = "quadrilátero";
    }

    @Override
    public double getPerimetro() {
        return ladoA + ladoB + ladoC + ladoD;
    }
}
