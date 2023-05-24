/*Escreva um programa que receba um número de 3 dígitos no formato CDU
(Centena, Dezena e Unidade) e, utilizando operadores aritméticos, armazene
cada dígito em uma variável de tipo inteiro. Por fim, reescreva o número no
formato UCD. Exemplo: 123 deve ser reescrito como 312.*/


package Questão5;

import java.util.Scanner;

public class CDU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero de 3 digitos no formato CDU: ");
        int num = sc.nextInt();

        int cent = num / 100;
        int dez = (num % 100) / 10;
        int und = num % 10;

        int newNum = (und * 100) + (cent * 10) + dez;

        System.out.print("A nova ordem é: " +newNum);
    }
}
