//Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3 valores reais serão informados pelo usuário.

package Questão2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        float n1 = sc.nextFloat();
        System.out.println("Digite o segundo numero");
        float n2 = sc.nextFloat();
        System.out.println("Digite o terceiro numero");
        float n3 = sc.nextFloat();
        float media = (n1 + n2 + n3) / 4;
        System.out.println("A media dos numero eh: " + media);
        sc.close();
    }
}
