package control;
import model.Guerreiro;
import model.Mago;
import model.Personagem;
import java.util.HashMap;
import java.util.Map;

public class Controle {
    Personagem personagem;
    Map <String, Personagem> personagens = new HashMap<String, Personagem>();
    public void criarPersonagem(String nome, int forca, int vida){
        personagem = new Personagem(nome, forca, vida);
        personagens.put(nome,personagem);
    }
    public void criarMago(String nome, int forca, int vida){
        personagem = new Mago(nome,forca,vida);
        personagens.put(nome,personagem);
    }
    public void criarGuerreiro(String nome, int forca,int vida){
        personagem = new Guerreiro(nome,forca,vida);
        personagens.put(nome,personagem);
    }
    public String verAtaque(){
        String ataque = "";
        for(Personagem p : personagens.values()){
            ataque += p.atacar() + "\n";

        }
        return ataque;
    }
    public String getRelatorio(){
        String relatorio = "";
        for(Personagem p : personagens.values()){
            relatorio += "\n--------------\n";
            relatorio += p.toString();
        }
        return relatorio;
    }

    public int getContador(){
        return Personagem.getCont();
    }


}
