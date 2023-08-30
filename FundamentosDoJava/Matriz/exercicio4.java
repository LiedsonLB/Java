public class Exercicio4 {
    public static void main(String[] args){
        double[][] matriz = {
            {1.4,2.3,3.0},
            {4.5,5.0,6.1},
            {7.7,8.1,9.0}
        };
        imprirNum(matriz);
    }
    public static void imprirNum(double[][] arr){
        double maiorNum = arr[0][0];
        double menorNum = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(maiorNum < arr[i][j]){
                    maiorNum = arr[i][j];
                } if(menorNum > arr[i][j]){
                    menorNum = arr[i][j];
                }
            }
        }
        System.out.printf("Maior numero: %f%n Menor numero: %f", maiorNum, menorNum);
    }
}