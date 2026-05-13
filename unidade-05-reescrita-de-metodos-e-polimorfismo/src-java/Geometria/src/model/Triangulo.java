package model;

import java.util.Optional;

public class Triangulo extends FigurasGeometricas{

    private double ladoA;
    private double ladoB;
    private double ladoC;

    private Triangulo(String cor, double ladoA, double ladoB, double ladoC) {
        super(cor);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.tipo = "triângulo";
    }

    public static Optional<Triangulo> criar(String cor, double ladoA, double ladoB, double ladoC){
        if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA){
            Triangulo t = new Triangulo(cor,ladoA,ladoB,ladoC);
            return Optional.of(t);
        }
        return Optional.empty();

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

    @Override
    public String toString() {
      return super.toString();
    }
}
