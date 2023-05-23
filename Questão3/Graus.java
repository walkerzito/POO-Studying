/*Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. 
Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.*/

package Questão3;

import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o angulo em graus: ");
        double deg = sc.nextDouble();
        double rad = Math.toRadians(deg);
        double consec = 1 / Math.sin(rad);
        double sec = 1 / Math.cos(rad);
        double cont = Math.cos(rad) / Math.sin(rad);
        System.out.println("Radiando é: " + rad);
        System.out.println("O Seno é: " + Math.sin(rad));
        System.out.println("O Cosseno é: " + Math.cos(rad));
        System.out.println("A Tangente é: " + Math.tan(rad));
        System.out.println("A Cossecante é: " + consec);
        System.out.println("A Secante é: " + sec);
        System.out.println("A Cotangente é: " + cont);
        sc.close();
    }
}
