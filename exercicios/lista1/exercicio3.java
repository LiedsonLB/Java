package exercicios.lista1;

import java.util.Scanner;

/* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e
o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
seu nome, o salário fixo e salário no final do mês. */

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        float salario;
        double vendas;

        System.out.print("Informe o Nome do vendedor: ");
        nome = scan.nextLine();
        System.out.print("Informe o Salario fixo: ");
        salario = scan.nextFloat();
        System.out.print("Informe o Total de vendas no mes(R$): ");
        vendas = scan.nextDouble();

        infoVendedor(nome, salario, vendas);
        scan.close();
    }
    public static void infoVendedor(String nome, float salario, double vendas){
        double salarioMensal = (vendas + (vendas * 0.15));
        System.out.printf("Informações do vendedor:%nNome: %s%nSalario fixo: %.2f%nSalario mensal: %.2f%n", nome, salario, salarioMensal);
    }
}
