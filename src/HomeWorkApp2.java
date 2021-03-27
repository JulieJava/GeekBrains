public class HomeWorkApp2 {
    public static void main(String[] args) {
        boolean result1 = checkSum(5, 11);
        System.out.println(result1);
        positiveOrNegativeNumber(25);
        System.out.println(checkPositive(9));
        cyclePrint(5, "Oh my brain......");
        System.out.println(leapYear(2021));
    }

    public static boolean checkSum(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static void positiveOrNegativeNumber(int d) {
        if (d >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean checkPositive(int e) {
        return e < 0;
    }

    public static void cyclePrint(int f, String str) {
        for (int i = 0; i < f; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0); // брат объяснил
    }

}
