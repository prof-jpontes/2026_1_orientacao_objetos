package model;

import java.util.Locale;

public class FigurasGeometricas {
    private String cor;
    protected String tipo;
    FigurasGeometricas(String cor){
        this.cor = cor;
    }
    public double getArea(){
        return 0;
    }
    public double getPerimetro(){
        return 0;
    }

    public String getCor() {
        return cor;
    }


    @Override
    public String toString() {
        String s = "Área: " + String.format("%.2f",this.getArea()) + "\n";
        s += "Perímetro: " + String.format("%.2f",this.getPerimetro()) + "\n";
        s += "Este é um " + this.tipo + " de cor " + this.getCor() + "\n";
        return s;
    }
}
