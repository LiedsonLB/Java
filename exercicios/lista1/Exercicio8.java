package exercicios.lista1;

import java.util.Scanner;

/* . Faça um algoritmo que receba o preço de custo de um produto e mostre o
valor de venda. Sabe-se que o preço de custo receberá um acréscimo de
acordo com um percentual informado pelo usuário. */

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o preço de custo do produto(R$): ");
        double precoDeCusto = scan.nextDouble();
        System.out.print("Informe o percentual de custo(%): ");
        double percentual = scan.nextDouble();

        double acrescimoDecimal = percentual / 100.0;

        double valorDeVenda = precoDeCusto * (1 + acrescimoDecimal);

        System.out.printf("Valor de venda do produto: ", valorDeVenda);
        
        scan.close();
    }
}
