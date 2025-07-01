package Revision_After_End_Sems;
import java.util.*;
public class remove_duplicates {

     private static HashSet<Integer> setMethod(int [] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set;
     }


    
    public static void main(String[] args) {
        int arr [] = {1,1,2,3,4,5,2,6};
        HashSet<Integer> set=new HashSet<>();
        set=setMethod(arr) ;
        int [] temp=new int[set.size()];
        int index=0;
        for(int e:set){
            temp[index++]=e;
        }
        for(int e:temp){
            System.out.print(e+" ");
        }

        
    }
}
