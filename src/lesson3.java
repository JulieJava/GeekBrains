import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        changeArrayElements();
        integerArr();
        increaseArray();
        diagonalArray();
        int[] result = twoArguments(15, 8);
        System.out.println(Arrays.toString(result));
    }

    //№1
    public static void changeArrayElements() {
        int[] array = {1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //№2
    public static void integerArr() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    //№3
    public static void increaseArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //№4
    public static void diagonalArray() {
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (i + j == array.length - 1) {
                    array[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    //№5
    public static int[] twoArguments(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
