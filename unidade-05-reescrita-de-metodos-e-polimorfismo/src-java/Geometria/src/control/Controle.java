package control;

import model.Circulo;
import model.FigurasGeometricas;
import model.Quadrilatero;
import model.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class Controle {
    List<FigurasGeometricas> figuras = new ArrayList<FigurasGeometricas>();

    private FigurasGeometricas fg;

    public void criarCirculo(String cor, double raio){
        fg = new Circulo(cor, raio);
        figuras.add(fg);
    }

    public void criarTriangulo(String cor, double ladoA, double ladoB, double ladoC){
        fg = new Triangulo(cor, ladoA, ladoB, ladoC);
        figuras.add(fg);
    }

    public void criarQuadrilatero(String cor, double a, double b, double c, double d){
        figuras.add(new Quadrilatero(cor, a, b, c, d));
    }

    @Override
    public String toString() {
        String s = "\n";
        for(int i = 0; i < figuras.size(); i++){
            s += "Área: " + figuras.get(i).getArea() + "\n";
            s += "Perímetro: " + figuras.get(i).getPerimetro() + "\n";
        }
        s += "-----------\n";
        return s;
    }
}
