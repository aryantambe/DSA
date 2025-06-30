package Revision_After_End_Sems;
public class second_smallest {

    private static int second_smallest1(int [] arr){
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int [] arr={-1,0,-4,7};
        System.out.println(second_smallest1(arr));
    }
}
