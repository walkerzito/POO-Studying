package Questão4;

import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Centigrados: ");
        double cent = sc.nextFloat();
        double fahr = cent * (1.8 + 32);
        System.out.print("A tempetura em Fahrenheit é: "+ fahr);
        sc.close();
    }
    
}