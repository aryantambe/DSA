package Revision_After_End_Sems;
import java.util.*;

class Solution {
    public int[] searchRange(int[] arr, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                list.add(i);
                break;
            }
        }
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]==target){
                list.add(j);
                break;
            }
        }
        int [] temp=new int[2];
        if(list.isEmpty()){
            return new int[]{-1,-1};
        }
        for(int i=0;i<temp.length;i++){
            temp[i]=list.get(i);
        }
            return temp;

        

    }
}
public class find_first_and_last_pos_in_arr {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={1,2,3,4,5,5};
       int [] res= obj.searchRange(arr, 5);
       for (int i : res) {
            System.out.print(i+" ");

       }

    }
}
