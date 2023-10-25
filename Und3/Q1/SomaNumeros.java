package Und3.Q1;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int numero1 = obterIntValido(scanner);
        
        System.out.println("Digite o segundo número:");
        int numero2 = obterIntValido(scanner);
        
        int resultado = numero1 + numero2;
        System.out.println("A soma dos números é: " + resultado);
    }

    public static int obterIntValido(Scanner scanner) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                numero = Integer.parseInt(scanner.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número inteiro válido.");
            }
        }

        return numero;
    }
}
