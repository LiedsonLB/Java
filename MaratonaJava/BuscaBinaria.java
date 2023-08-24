package MaratonaJava;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] sortedArray = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 }; // array ordenado de numeros
        int target = 16; // numero a ser procurado

        int index = binarySearch(sortedArray, target); // chamando método da busca binária

        if (index != -1) { // verifica se o numero foi encontrado no array
            System.out.println("O numero " + target + " esta na posicao " + index); // retorna o numero e array
        } else {
            System.out.println("O numero " + target + " nao foi encontrado no array."); // retorna que o numero não foi encontrado
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0; // primeira posição do array
        int right = array.length - 1; // ultima posição do array

        while (left <= right) { // o laço irá se repetir até as extremidades chegarem no meio
            int middle = left + (right - left) / 2; // determinando a posição do meio do array

            if (array[middle] == target) { // verificando se o numero é igual ao que está no meio
                return middle;  // elemento será retornado quando estiver no meio
            }

            if (array[middle] < target) { // verifica para qual lado o array será encurtado
                left = middle + 1;  // limitando a busca da esquerda
            } else {
                right = middle - 1;  // limitando a busca da direita
            }
        }

        return -1;  // caso o elemento não seja encontrado
    }
}
