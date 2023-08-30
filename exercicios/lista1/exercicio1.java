package exercicios.lista1;

import java.util.Scanner;

/* Escreva um algoritmo que leia dois números e ao final mostre a soma,
subtração, multiplicação e a divisão dos números lidos */

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num1, num2;

        System.out.print("Escreva o Primeiro numero: ");
        num1 = scan.nextDouble();
        System.out.print("Escreva o Segundo numero: ");
        num2 = scan.nextDouble();

        opNums(num1, num2);
        scan.close();
    }
    public static void opNums(double num1, double num2){
        double sum, subst, multiplice, division = 0;

        sum = num1 + num2;
        subst = num1 - num2;
        multiplice = num1 * num2;
        division = num1 / num2;
        System.out.printf("A Soma dos numeros: %.2f%nA Subtracao dos numeros: %.2f%nA Multiplicacao dos numeros: %.2f%nA Divisao dos numeros: %.2f%n", sum, subst, multiplice, division);
    }
}