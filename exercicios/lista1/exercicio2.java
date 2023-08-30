package exercicios.lista1;

import java.util.Scanner;

/* Escreva um algoritmo para determinar o consumo médio de um automóvel
sendo fornecida a distância total percorrida pelo automóvel e o total de
combustível gasto. */

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        double distance, combustive;
        System.out.print("Informe a Distancia pecorrida(Km): ");
        distance = scan.nextDouble();
        System.out.print("Informe o Total consumido(L): ");
        combustive = scan.nextDouble();

        System.out.printf("O consumo medio do carro: %.2f Km/L", consumeCar(distance, combustive));
        scan.close();
    }
    public static double consumeCar(double distance, double combustive) {
        double consumoMedia;
        
        consumoMedia = distance / combustive;
        return consumoMedia;
    }
}
