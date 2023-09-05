package exercicios.lista1;

import java.util.Scanner;

/* Escreva um algoritmo que receba um valor que foi depositado em uma conta
poupança e exiba o valor com rendimento após um mês. Considere fixo o
juro da conta poupança em 0,70% a.m. */

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva o valor depositado na conta: ");
        double valorDepositado = scan.nextDouble();

        double taxaDeJurosMensal = 0.007;

        double valorComRendimento = valorDepositado + (valorDepositado * taxaDeJurosMensal);

        System.out.println("O valor com rendimento apos um mês é: R$" + valorComRendimento);

        scan.close();
    }
}
