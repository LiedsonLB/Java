package exercicios.lista1;

import java.util.Scanner;

/* Escreva um algoritmo que leia uma temperatura em graus Celsius e
apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F =
(9*C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em
Celsius. */

public class Exercicio4 {
    public static void main(String[] args){
        float tempCelsious;
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva a temperatura em Celsius: ");
        tempCelsious = scan.nextFloat();
        System.out.printf("%.1f graus em Fahrenheit: %.1f", tempCelsious, convertion(tempCelsious));
        scan.close();    
    } 
    public static float convertion(float celsius){
        float convertionValue = (celsius * 9/5) + 32;
        return convertionValue;
    }
}
