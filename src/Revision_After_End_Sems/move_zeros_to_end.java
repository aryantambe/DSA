package Revision_After_End_Sems;

import java.util.ArrayList;

public class move_zeros_to_end {
    private static void brute(int [] arr){
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        for(int i=list.size();i<arr.length;i++){
            list.add(0);
        }
        for (int e : list) {
            System.out.print(e+" ");
        }
        
    }
    public static void main(String[] args) {
        int [] arr={1,0,0,2,3,4,0};
        brute(arr);
    } 
}
