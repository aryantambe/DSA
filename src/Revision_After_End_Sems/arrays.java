package Revision_After_End_Sems;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
