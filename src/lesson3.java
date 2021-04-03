import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        changeArrayElements();
        integerArr();
    }
//№1
    public static void changeArrayElements() {
        int[] array = {1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else{
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //№2
    public static void integerArr(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
