package Revision_After_End_Sems;
import java.util.*;
public class union_of_2_arrays {
    private static int [] brute(int [] n, int [] m){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n.length;i++){
            set.add(n[i]);
        }
        for(int i=0;i<m.length;i++){
            set.add(m[i]);
        }
        int temp[]=new int[set.size()];
        int index=0;
        for (int e : set) {
            temp[index++]=e;
        }
        return temp;
    }
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={0,1,2,3,4,5,6};
        int res[]=brute(arr1, arr2);
        for (int i : res) {
            System.out.print(i+" ");
        }

    }
}
