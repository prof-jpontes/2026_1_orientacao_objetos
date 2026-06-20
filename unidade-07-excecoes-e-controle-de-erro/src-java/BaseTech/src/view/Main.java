package view;
import control.Controller;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        FuncionarioView view = new FuncionarioView(new Controller());
        view.iniciar();
    }
}

