package Revision_After_End_Sems;
import java.util.*;


public class array2 {

    private static int largest_num(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    private static int sorted_largest_num(int [] arr){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        return max;
    }
    public static void main(String[] args) {
        int [] arr={12,2,3,4,5,10};
        int res=largest_num(arr);
        System.out.println(res);

        
        int max=sorted_largest_num(arr);
        System.out.println(max);




    }
    
}
