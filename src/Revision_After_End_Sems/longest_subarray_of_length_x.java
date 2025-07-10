package Revision_After_End_Sems;

public class longest_subarray_of_length_x {

    //Leetcode 560- given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
    class Solution {
    public int subarraySum(int[] arr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}

    private static int bruteForce(int [] arr,int x){
        int longestLength=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k]; 
                }
                if(sum==x){
                        longestLength=Math.max(longestLength, j-i+1);
                    }
            }
        }
        return longestLength;
    }

    private static int better(int [] arr,int x){
        int longestLength=0;
        for(int i=0;i<arr.length;i++){   //1,2,3,4,5
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==x){
                        longestLength=Math.max(longestLength, j-i+1);
                    }
            }
        }
        return longestLength;
    }


    public static void main(String[] args) { 
         int [] arr={1,2,3,1,1,1,2,1};
         int res=bruteForce(arr,3);  
         System.out.println(res); 
         int res1=better(arr,3); 
         System.out.println(res1); 

        
    }
}
