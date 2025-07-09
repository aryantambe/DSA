package Revision_After_End_Sems;

//LEETCODE 977 

public class sqared_and_sorted_array {
    static class  Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                res[pos--] = leftSq;
                left++;
            } else {
                res[pos--] = rightSq;
                right--;
            }
        }

        return res;
    }
   
}
 public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]={-4,-1,2,3,};
        int[] res=obj.sortedSquares(arr);
        for (int i : res) {
            System.out.print(i+" ");
        }
        
    }
}
