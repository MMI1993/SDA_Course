package main.java.designpatterns.src.designPatterns.probleme.numberOfCoins;

public class NumberOfCoins {
    public static void main(String[] args) {
        Integer[][] coinMatrix = {
                {0, 3, 1, 1},
                {2, 0, 19, 4},
                {1, 5, 3, 1}
        };
        System.out.println(calculateCoins(coinMatrix, 0, 0));
    }
    public static int calculateCoins(Integer[][] matrix, int row, int col) {
        boolean isBottom = row == matrix.length - 1;
        boolean isRightmost = col == matrix[row].length - 1;
        if (isBottom && isRightmost)
            return matrix[row][col];
        else if (isBottom)
            return matrix[row][col] + calculateCoins(matrix, row, col+1);
        else if (isRightmost)
            return matrix[row][col] + calculateCoins(matrix, row + 1, col);
        else
            return matrix[row][col] + Math.max(calculateCoins(matrix, row + 1, col), calculateCoins(matrix, row, col + 1));
    }
}