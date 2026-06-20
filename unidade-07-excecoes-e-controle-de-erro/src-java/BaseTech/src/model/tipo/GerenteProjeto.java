package model.tipo;

import model.tipo.Tipo;

public class GerenteProjeto implements Tipo {

    private static final double PERCENTUAL = 0.20;

    @Override
    public String getDescricao() {
        return "Gerente de Projeto";
    }

    @Override
    public double calcularAdicional(double salarioBase) {
        return PERCENTUAL * salarioBase;
    }
}
