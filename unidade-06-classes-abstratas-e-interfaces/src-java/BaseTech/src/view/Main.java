//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import control.Controller;
import view.FuncionarioView;

public static void main(String[] args) throws IOException, InterruptedException {
    FuncionarioView view = new FuncionarioView(new Controller());
    view.iniciar();
}

