/*
 * Crie um método que receba uma matriz de números inteiros e imprima
a soma dos elementos da diagonal principal.
 */

public class exercicio5 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.printf("A soma da matriz eh %d", diagonalSum(arr));
    }
    public static int diagonalSum(int[][] matriz){
        int sum = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == j){
                    sum+= matriz[i][j];
                }
            }
        }
        return sum;
    }
}
