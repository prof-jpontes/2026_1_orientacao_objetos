package model;

public class Quadrado extends  Retangulo{
    public Quadrado(String cor, double lado) {
        super(cor, lado, lado);
        this.tipo = "quadrado";
    }
}
