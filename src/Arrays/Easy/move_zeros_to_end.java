package Arrays.Easy;

import java.util.*;

public class move_zeros_to_end {
    public static void bruteForceArrayList(int [] arr){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int i= temp.size();
        while(i<arr.length){
            temp.add(0);
            i++;
        }
        for(int e:temp){
            System.out.print(e+" ");
        }
        for(int k=0;k<arr.length;k++){
            arr[k]=temp.get(k);
        }
        System.out.println();
        for(int el: arr){
            System.out.print(el+" ");
        }
    }

    //Using the 2 pointer approach
    public static void optimal(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[i++]=arr[j];
            }
        }
        while(i<arr.length){
            arr[i++]=0;
        }
        for(int el: arr){
            System.out.print(el+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,0,6,0,4,0};
        bruteForceArrayList(arr);
        optimal(arr);


    }
}
