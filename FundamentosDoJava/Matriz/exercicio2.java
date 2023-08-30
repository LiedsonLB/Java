/* Faça um método que receba um inteiro N e crie uma matriz NxN que 
contenha os números de 1 a N² em ordem crescente:
Ex: N=3 Ex: N=4
1 2 3 1 2 3 4
4 5 6 5 6 7 8
7 8 9 9 10 11 12
13 14 15 16
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        crirMatriz(N);
        scan.close();
    }
    public static void crirMatriz(int tam) {
        int[][] arr = new int[tam][tam];
        int num = 1;

        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                arr[i][j] = num;
                System.out.printf("%d ", num);
                num++;
            }
        System.out.println("");
        }
    }
}