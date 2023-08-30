import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] square = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = scanner.nextInt();
            }
        }

        if (isMagicSquare(square)) {
            int targetSum = rowSum(square, 0);
            System.out.println(targetSum);
        } else {
            System.out.println(-1);
        }
        scanner.close();
    }

    static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;
        int targetSum = rowSum(matrix, 0);

        for (int i = 0; i < n; i++) {
            if (rowSum(matrix, i) != targetSum || colSum(matrix, i) != targetSum) {
                return false;
            }
        }

        if (diagSum(matrix, true) != targetSum || diagSum(matrix, false) != targetSum) {
            return false;
        }

        return true;
    }

    static int rowSum(int[][] matrix, int rowIndex) {
        int sum = 0;
        for (int num : matrix[rowIndex]) {
            sum += num;
        }
        return sum;
    }

    static int colSum(int[][] matrix, int colIndex) {
        int sum = 0;
        for (int[] row : matrix) {
            sum += row[colIndex];
        }
        return sum;
    }

    static int diagSum(int[][] matrix, boolean mainDiagonal) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int j = mainDiagonal ? i : n - i - 1;
            sum += matrix[i][j];
        }
        return sum;
    }
}