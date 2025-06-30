package Revision_After_End_Sems;

public class check_if_arr_sorted {
    private static boolean fn(int [] arr){

        for(int i=1;i<arr.length;i++){
                if(arr[i]<=arr[i-1]) return false; 
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,1};
        System.out.println(fn(arr));
    }
}
