/*Crie um método que receba uma matriz de números inteiros e retorne a
soma de todos os seus elementos */

public class exercicio3 {
    public static void main(String[] args){
        int[][] arr = {
            {1, 2 ,3},
            {4, 5 ,6},
            {7, 8 ,9}
        };
        int soma = SomaMatriz.somaMatriz(arr);
        
        System.out.printf("Soma da matriz: %d", soma);
    }
}
class SomaMatriz {
    public static int somaMatriz(int[][] matriz){
        int sum = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                sum = sum + matriz[i][j];
            }
        }
        return sum;
    }
}