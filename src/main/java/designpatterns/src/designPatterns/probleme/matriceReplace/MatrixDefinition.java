package main.java.designpatterns.src.designPatterns.probleme.matriceReplace;

public class MatrixDefinition {
        public static void main(String[] args) {
            char[][] image = {
                    {'B', 'B', 'W', 'W'},
                    {'W', 'W', 'W'},
                    {'W', 'W', 'W'},
                    {'B', 'B', 'B'},
                    {'W', 'W', 'W'}
            };
            print(image);
            replaceColor(image, 'R', 0, 0);
            print(image);
        }

        public static void print(char[][] image) {
            for (char[] row : image) {
                for (char character : row)
                    System.out.print(character + " ");
                System.out.println();
            }
            System.out.println();
        }

        public static void replaceColor(char[][] image, char color, int row, int col) {
            if (!isColValid(col, row, image) || !isRowValid(row, image) || image[row][col] == color)
                return;
            replaceColor(image, color, image[row][col], row, col);
        }

        public static boolean isRowValid(int row, char[][] image) {
            return row >= 0 && row < image.length;
        }

        public static boolean isColValid(int col, int row, char[][] image) {
            return isRowValid(row, image) && col >= 0 && col < image[row].length;
        }

        public static void replaceColor(char[][] image, char targetColor, char previousColor, int row, int col) {
            if (!isColValid(col, row, image) || !isRowValid(row, image) || image[row][col] != previousColor)
                return;
            image[row][col] = targetColor;
            replaceColor(image, targetColor, previousColor, row - 1, col);
            replaceColor(image, targetColor, previousColor, row + 1, col);
            replaceColor(image, targetColor, previousColor, row, col + 1);
            replaceColor(image, targetColor, previousColor, row, col - 1);
        }
    }
