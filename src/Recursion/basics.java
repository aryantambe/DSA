package Recursion;

public class basics {
    static int count = 0;

    public static void printCount() {
        if (count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        printCount();
    }

    public static void main(String[] args) {
        printCount();
    }
}
