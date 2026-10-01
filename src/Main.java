import java.util.Random;
public class Main {
    //import java.util.Random;
    private static final int SIZE = 8;
    private static final int MAX_COLOR_VALUE = 256;
    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotColors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < colors.length; i++) {
            //System.out.println(colors[i]);
            for (int j = 0; j < colors.length; j++) {
                colors[i][j] = random.nextInt(MAX_COLOR_VALUE);
            }
        }
        printViewMatrix(colors);
        System.out.format("Перевернутая матрица\n");
        rotateMatrix(rotColors, colors);
        printViewMatrix(rotColors);
    }
    private static void printViewMatrix(int[][] colors) {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }
    // элемент (i, j) переходит в (j, n-1-i)
    public static void rotateMatrix(int rotColors[][], int colors[][]) {
        int n = colors.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotColors[j][n - 1 - i] = colors[i][j];
            }
        }
    }
}



