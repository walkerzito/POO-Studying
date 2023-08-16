package Questão43;

public class TestaEquipamento {
    public static void main(String[] args) {
        Computador comp = new Computador("Mouse", "Red", 5, 1);
        Equipamento eqp = new Equipamento("Teclado", "Green");

        System.out.println(comp);
        System.out.println(eqp);
    }
}
