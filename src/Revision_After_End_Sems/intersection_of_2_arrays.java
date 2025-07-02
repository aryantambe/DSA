package Revision_After_End_Sems;

import java.util.*;

public class intersection_of_2_arrays {
    private static ArrayList<Integer> brute(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        int[] visited = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j] && visited[j] == 0) {
                    list.add(a[i]);
                    visited[j] = 1;
                    break;
                }
                if (b[j] > a[i])
                    break;
            }
        }
        return list;
    }

    private static ArrayList<Integer> optimal(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            }
            else if(b[j]<a[i]){
                j++;
            }
            else{
                list.add(a[i]);
                i++;
                j++;
            }

        }
        return list;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 4, 5, 5 };
        int[] b = { 1, 2, 3, 4, 5, 5, 6, 7, 8 };
        ArrayList<Integer> list = new ArrayList<>();
        list = brute(a, b);
        for (int e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1=optimal(a, b);
        for (int e : list1) {
            System.out.print(e + " ");
        }
        

    }

}
