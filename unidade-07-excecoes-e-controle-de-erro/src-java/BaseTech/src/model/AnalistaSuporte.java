package model;

public class AnalistaSuporte implements  Tipo{

    private int chamadosResolvidos;
    private double adicionalChamadosResolvidos;


    public AnalistaSuporte(double adicionalChamadosResolvidos) {
        this.chamadosResolvidos = 0;
        this.adicionalChamadosResolvidos = adicionalChamadosResolvidos;
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
