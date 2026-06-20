package view;
import control.Controller;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        BaseTechView view = new BaseTechView(new Controller());
        view.iniciar();
    }
}

