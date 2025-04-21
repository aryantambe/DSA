package Arrays.Easy;

import java.util.ArrayList;
import java.util.TreeSet;

public class union_of_sorted {
    public static int [] bruteForce(int [] arr1,int []arr2){
        TreeSet<Integer> set=new TreeSet<>();
        for(int n:arr1){
            set.add(n);
        }
        for(int m: arr2){
            set.add(m);
        }
        int[] arr=new int [set.size()];
        int k=0;
        for(int j:set){
            arr[k++]=j;
        }
        return arr;
    }
    private static ArrayList<Integer> optimal(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        int[] arr2={1,2,3,4,5,6,6};
        int []arr1={7,8,9,10,11};
        int [] arr;
        arr=bruteForce(arr1,arr2);
        for (int j : arr) {
            System.out.print(j + " ");
        }
       ArrayList<Integer> list= optimal(arr1,arr2);
        for(int e:list){
            System.out.print(e+" ");
        }
    }
}
