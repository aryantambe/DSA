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
     //assuming the array is sorted
     private static int optimal_returns_length(int [] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1; //this is the length of the array that contains all the unique elements
     }


    
    public static void main(String[] args) {
        int arr [] = {1,1,2,3,4,5,6,6};
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
        System.out.println();

        System.out.println(optimal_returns_length(arr));

        
    }
}
