package exercicios.lista1;

import java.util.Scanner;

/* Escreva um algoritmo que efetue a apresentação do valor da conversão em
real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor
da cotação do dólar e também a quantidade de dólares disponíveis com o
usuário. */

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o valor em Dolar: ");
        double valorDolar = scan.nextDouble();
        System.out.print("Informe a cotação do dólar: ");
        double cotacao = scan.nextDouble();

        System.out.printf("O valor U$%.2f em Real é R$%.2f", valorDolar, conversao(valorDolar, cotacao));
        scan.close();
    }
    public static double conversao(double valorDolar, double cotacao){
        double valorReal = valorDolar * cotacao;
        return valorReal;
    }
}
