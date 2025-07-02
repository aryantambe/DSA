package Revision_After_End_Sems;

import java.util.ArrayList;

public class move_zeros_to_end {
    private static void brute(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }
        for (int i = list.size(); i < arr.length; i++) {
            list.add(0);
        }
        for (int e : list) {
            System.out.print(e + " ");
        }

    }

    // 2 pointers approach
    private static void optimal(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0)
                arr[i++] = arr[j];
        }
        while(i<arr.length){
            arr[i++]=0;
        }
        for (int e : arr) {
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 2, 3, 4, 0 };
        int[] arr1 = { 1, 0, 0, 2, 3, 4, 0 };
        brute(arr);
        System.out.println();
        optimal(arr1);

    }
}
