package exercicios.lista1;

import java.util.Scanner;

/* A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
prestações sem juros. Faça um algoritmo que receba um valor de uma
compra e mostre o valor das prestações. */

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o valor do produto: ");
        double valorProduto = scan.nextDouble();

        double valorPrestacao = valorProduto / 5;

        System.out.println("valor de cada prestacao: R$" + valorPrestacao);
        scan.close();
    }
}
