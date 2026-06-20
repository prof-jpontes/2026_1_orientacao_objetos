package model.tipo;

public class Desenvolvedor implements Tipo {

    private Nivel nivel;

    public Desenvolvedor(Nivel nivel) {
        this.nivel = nivel;
    }

    @Override
    public String getDescricao() {
        return "Desenvolvedor";
    }

    @Override
    public double calcularAdicional(double salarioBase) {
        return this.nivel.getBonus();
    }

    public void promover(){
        if(this.nivel == Nivel.JUNIOR)this.nivel = Nivel.PLENO;
        else this.nivel = Nivel.SENIOR;
    }

}
