package EntradeESaida;

import java.util.Scanner;  // Importa a classe Scanner para possibilitar a entrada de dados

public class InputOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Cria uma instância de Scanner para ler entrada do usuário

        System.out.print("Digite Seu Nome: ");  // Solicita ao usuário que insira seu nome
        String name = scan.nextLine();  // Lê a linha de entrada do usuário e armazena em 'name'

        System.out.print("Digite Sua Idade: ");  // Solicita ao usuário que insira sua idade
        int age = scan.nextInt();  // Lê o número da idade inserida pelo usuário e armazena em 'age'

        System.out.println("Nome: " + name);  // Imprime o nome lido
        System.out.println("Idade: " + age);    // Imprime a idade lida
        scan.close();
    }
}
