package Revision_After_End_Sems;

import java.util.*;

public class union_of_2_arrays {
    private static int[] brute(int[] n, int[] m) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n.length; i++) {
            set.add(n[i]);
        }
        for (int i = 0; i < m.length; i++) {
            set.add(m[i]);
        }
        int temp[] = new int[set.size()];
        int index = 0;
        for (int e : set) {
            temp[index++] = e;
        }
        return temp;
    }

    // as the array is sorted:-
    private static ArrayList<Integer> optimal(int[] n, int[] m) {
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = n.length;
        int m1 = m.length;
        int i = 0;
        int j = 0;
        while (i < n1 && j < m1) {
            if (n[i] <= m[j]) { // to maintain order we take the smallest out of them
                if (list.isEmpty() || list.get(list.size() - 1) != n[i]) { // checking if the list already has the
                                                                           // element that i am inseritng
                    list.add(n[i]);
                }
                i++;
            } else if (m[j] <= n[i]) { // to maintain order we take the smallest out of them
                if (list.isEmpty() || list.get(list.size() - 1) != m[j]) { // checking if the list already has the
                                                                           // element that i am inseritng
                    list.add(m[j]);
                }
                j++;
            }
        }

        // now if any of the 2 arrays get exhausted then..
        while (i < n1) {
            if (list.isEmpty() || list.get(list.size() - 1) != n[i]) {
                list.add(n[i]);
            }
            i++;
        }
        while (j < m1) {
            if (list.isEmpty() || list.get(list.size() - 1) != m[j]) { // checking if the list already has the element
                                                                       // that i am inseritng
                list.add(m[j]);
            }
            j++;
        }
        return list;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 8, 10 };
        int[] arr2 = { 0, 1, 2, 3, 4, 5, 6, 79 };
        int res[] = brute(arr1, arr2);
        for (int i : res) {
            System.out.print(i + " ");
        }
        ArrayList<Integer> result = new ArrayList<>();
        result = optimal(arr1, arr2);
        System.out.println();
        for (int e : result) {
            System.out.print(e + " ");
        }

    }
}
