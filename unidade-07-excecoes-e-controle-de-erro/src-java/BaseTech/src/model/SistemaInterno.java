package model;

import java.util.HashMap;
import java.util.Map;

public class SistemaInterno {

    private Map<String, Autenticavel> autenticavelMap = new HashMap<>();

    public void cadastrar(String cpf, Autenticavel a){
        this.autenticavelMap.put(cpf, a);
    }

    public boolean login(String usuario, String senha){
        if(!this.autenticavelMap.containsKey(usuario)) return false;
        return (autenticavelMap.get(usuario).autenticar(senha));
    }
}
