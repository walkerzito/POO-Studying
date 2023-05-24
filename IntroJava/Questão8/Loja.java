// Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção
// relâmpago em dois setores:
// ● No setor de Eletros, que possui código 222, todas as peças que custam
// mais de R$ 500 vão ter 10% de desconto.
// ● No setor de Cama, mesa e banho, que possui código 111, peças com
// valor acima de R$ 100 vão ter 40% de desconto, peças que custam entre
// R$ 50 e R$ 100 vão ter 20% de desconto e peças abaixo de R$ 50 vão
// ter 10% de desconto.
// ● Escreva um programa que recebe do usuário o código do setor da loja e o
// valor original de um produto e imprime na tela o nome do setor e o valor
// do produto com desconto. Caso o usuário forneça um código diferente de
// 111 ou 222, exiba a mensagem Setor Invalido

package Questão8;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o codigo do setor da loja (222 ou 111): ");
        int codigo = sc.nextInt();
        
        System.out.println("Digite o valor do produto: " );
        double valorProd = sc.nextDouble();

        double valorDesconto = 0;
        String setor = "";

        if (codigo == 222) {
            setor = "Setor de Eletros";
        
            if (valorProd > 500) {
                double desconto = valorProd * 0.10;
                valorDesconto = valorProd - desconto;
            } else {
                valorDesconto = valorProd;
            }
        } else if (codigo == 111){
            setor = "Setor de Cama, mesa e banho";

            if(valorProd > 100) {
                double desconto = valorProd * 0.40;
                valorDesconto = valorProd - desconto;
            } else if (valorProd >= 50 && valorProd <= 100){
                double desconto = valorProd * 0.20;
                valorDesconto = valorProd - desconto;
            } else {
                double desconto = valorProd * 0.10;
                valorDesconto = valorProd - desconto;
            }
        } else {
            System.out.println("Setor Inválido");
            sc.close();
            return;
        }

        System.out.println("Setor: "+ setor);
        System.out.println("Valor do produto com desconto: "+ valorDesconto);
        sc.close();
    }
}
