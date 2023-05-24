// Escreva um programa que lê três números e determina qual número é o menor.

package Questão7;

import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        int menor = num2;

        if (num1 < menor) {
            menor = num1;
        }

        if (num3 < menor) {
            menor = num3;
        }

        System.out.print("O menor numero eh: "+ menor);
        sc.close();
    }
}
