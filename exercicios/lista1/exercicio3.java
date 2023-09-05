package exercicios.lista1;

import java.util.Scanner;

/* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e
o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
seu nome, o salário fixo e salário no final do mês. */

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o Nome do vendedor: ");
        String nome = scan.nextLine();
        
        System.out.print("Informe o Salario fixo: ");
        float salarioFixo = scan.nextFloat();
        
        System.out.print("Informe o Total de vendas no mes(R$): ");
        double vendasTotal = scan.nextDouble();
        
        double salarioMensal = salarioFixo + (vendasTotal * 0.15);
        
        exibirInfoVendedor(nome, salarioFixo, salarioMensal);
        
        scan.close();
    }
    
    public static void exibirInfoVendedor(String nome, float salarioFixo, double salarioMensal) {
        System.out.println("Informações do vendedor:");
        System.out.println("Nome: " + nome);
        System.out.printf("Salario fixo: %.2f%n", salarioFixo);
        System.out.printf("Salario mensal: %.2f%n", salarioMensal);
    }
}
