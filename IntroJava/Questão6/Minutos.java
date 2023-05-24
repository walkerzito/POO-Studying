// Escreva um programa que recebe um valor inteiro representando um intervalo
// em minutos e imprime o equivalente a esse período expresso em valores inteiros
// para dias, horas e minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.

package Questão6;

import java.util.Scanner;

public class Minutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero que represente os minutos: ");
        int interMin = sc.nextInt();

        int dia = interMin / (24 * 60);
        int hora = (interMin % (24 * 60)) / 60;
        int min = interMin % 60;

        System.out.print("Equivalente a: " + dia + " dias, " + hora + " horas, " + min + " minutos. ");
        sc.close();
    }
}
