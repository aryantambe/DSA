package Revision_After_End_Sems;

public class longest_subarray_of_length_x {

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
    public static void main(String[] args) { 
         int [] arr={1,2,3,1,1,2,1};
         int res=bruteForce(arr,3);  
         System.out.println(res);                                                        
        
    }
}
