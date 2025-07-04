package Revision_After_End_Sems;
import java.util.*;
public class missing_number_in_array {
    // contain numbers b/w 1 to n and if array is sorted
    private static int sorting_first(int [] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return 0;
    }


    //using hashing 1 to N
    private static int hash(int[] arr){ //1,2,3,5
        int hashArr[]=new int[arr.length+2];
        for(int i=0;i<arr.length;i++){
            hashArr[arr[i]]=1;
        }
        for(int i=1;i<hashArr.length-1;i++){
            if(hashArr[i]==0) return i;
        }
        return 0;
    }

    //This is for 0 to N
     private static int missingNumber(int[] nums) {
      int sum1=0;
      int sum2=0;
      for(int i=0;i<nums.length;i++){
        sum1+=nums[i];
      }
      for(int i=0;i<=nums.length;i++){
        sum2+=i;
      }
      return sum2-sum1;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,9};
        System.out.println(sorting_first(arr));
        System.out.println(hash(arr));
        System.out.println(missingNumber(arr));
    }
}
