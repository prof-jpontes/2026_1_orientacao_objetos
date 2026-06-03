package model;

public class SistemaInterno {


    public static boolean login(Autenticavel a, String senha){
        if(a.autenticar(senha)){
            return true;
        }
        return false;
    }
}
