package Revision_After_End_Sems;

public class max_consecutive_ones {
    private static int fn(int [] arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;  
            }
            else{
                max=count;
                count=0;
                max=Math.max(count,max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr={1,1,0,0,1,1,1,0,1,1};
        System.out.println(fn(arr)   );
    }
}
