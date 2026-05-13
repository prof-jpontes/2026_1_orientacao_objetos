package model;

public class Retangulo extends Quadrilatero{

    public Retangulo(String cor, double ladoA, double ladoB) {
        super(cor, ladoA, ladoB, ladoA, ladoB);
        this.tipo = "retângulo";
    }

    @Override
    public double getArea() {
        return ladoA * ladoB;
    }
}
