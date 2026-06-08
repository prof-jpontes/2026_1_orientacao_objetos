package model;

public class AnalistaSuporte implements  Tipo{

    private int chamadosResolvidos;
    private double adicionalChamadosResolvidos;


    public AnalistaSuporte(double adicionalChamadosResolvidos) {
        this.adicionalChamadosResolvidos = adicionalChamadosResolvidos = 0;
    }

    @Override
    public String getDescricao() {
        return "Chamados Resolvidos";
    }

    @Override
    public double calcularAdicional(double salarioBase) {
        return chamadosResolvidos * adicionalChamadosResolvidos;
    }
    public void registrarAtendimento(){
        chamadosResolvidos++;
    }
}
