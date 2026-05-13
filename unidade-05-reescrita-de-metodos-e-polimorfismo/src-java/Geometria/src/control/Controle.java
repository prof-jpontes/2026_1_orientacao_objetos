package control;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.zip.CheckedInputStream;

public class Controle {
    List<FigurasGeometricas> figuras = new ArrayList<FigurasGeometricas>();

    private FigurasGeometricas fg;

    public void criarCirculo(String cor, double raio, String tipo){
        figuras.add(new Circulo(cor,raio));
    }

    public void criarTriangulo(String cor, double ladoA, double ladoB, double ladoC){
        Optional<Triangulo> f = Triangulo.criar(cor,ladoA,ladoB,ladoC);
        if(f.isPresent())figuras.add(f.get());
    }

    public void criarQuadrilatero(String cor, double a, double b, double c, double d){
        figuras.add(new Quadrilatero(cor, a, b, c, d));
    }

    public void criarRetangulo(String cor, double ladoA, double ladoB){
        figuras.add(new Retangulo(cor,ladoA,ladoB));
    }

    public void criarQuadrado(String cor, double lado){
        figuras.add(new Quadrado(cor,lado));
    }
    @Override
    public String toString() {
        String s = "\n";
        for(int i = 0; i < figuras.size(); i++){
            s += figuras.get(i);
            s += "-----------\n";
        }
        return s;
    }

}
