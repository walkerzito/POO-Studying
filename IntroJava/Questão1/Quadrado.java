//Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado deverá ser informado pelo usuário.


package Questão1;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner l1 = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do quadrado:");
        float lado = l1.nextFloat();
        float area = lado * lado;
        System.out.println("A area do quadrado é: " + area);
        l1.close();
    }
    
}