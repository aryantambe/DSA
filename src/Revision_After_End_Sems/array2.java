package Revision_After_End_Sems;


public class array2 {

    private static int largest_num(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr={12,2,3,4,5,10};
        int res=largest_num(arr);
        System.out.println(res);

        
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=i;
        }
        System.out.println(sum);


    }
    
}
