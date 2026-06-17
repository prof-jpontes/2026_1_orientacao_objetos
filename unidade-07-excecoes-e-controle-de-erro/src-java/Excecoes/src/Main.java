//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    metodo1();
}
public static void metodo1(){
    System.out.println("Início do método 1");
    metodo2();
    System.out.println("Término do método 1");
}
public static void metodo2(){
    System.out.println("Início do método 2");
    try {
        metodo3();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    System.out.println("Término do método 2");
}
public static void metodo3() throws Exception {
    System.out.println("Início do método 3");
    int[] vetor = {2,3,5,7,11,13,17};
    for (int i = 0; i < 10; i++){
        System.out.printf("Iteração %d, valor: %d\n", i+1, vetor[i]);
    }
    System.out.println("Término do método 3");
}