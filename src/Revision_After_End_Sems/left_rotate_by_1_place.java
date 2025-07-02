package Revision_After_End_Sems;

public class left_rotate_by_1_place{

    private static int[] left_rotate(int [] nums){
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){   //1,2,3,4,5 -> 2,3,4,5,1 
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        return nums;
    }
    private static int[] right_rotate(int [] nums){ //always use a decrementing for loop to avoid overwirting and corrupting the array
        int temp=nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
           nums[i]= nums[i-1];   //1,2,3,4,5 -> 1,2,3,4,4 -> 1,2,3,3,4 -> 1,2,2,3,4 -> 1,1,2,3,4 -> 5,1,2,3,4 (ans)
        }
        nums[0]=temp;
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[]={1,2,3,4,5};
        int[] res=left_rotate(arr);
        for (int e : res) {
            System.out.print(e+" ");
        }
        System.out.println();
        int[] result=right_rotate(arr1);
        for (int e : result) {
            System.out.print(e+" ");
        }
        
    }
}