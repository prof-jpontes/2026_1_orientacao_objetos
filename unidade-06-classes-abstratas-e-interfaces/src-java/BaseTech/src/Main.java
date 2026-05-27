//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import control.ControllerFuncionario;
import view.FuncionarioView;

public static void main(String[] args) {
    FuncionarioView view = new FuncionarioView(new ControllerFuncionario());
    view.iniciar();
}
