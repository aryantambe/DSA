package Arrays.Easy;
// This is a LEETCODE 1752 PROBLEM

public class check_if_arr_sorted_and_rotated {

     private static boolean isSorted(int [] nums){
         for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }

    private static void rotate(int [] nums){
        int start=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=start;
    }

    public static boolean check(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(isSorted(nums)) return true;
            rotate(nums);
        }
        return false;
       
    }
    
    public static void main(String[] args) {
        int [] arr={4,1,2,3};
        System.out.println(check(arr));
    }
}
