package Arrays;

public class reverse_min_max_sum {
    public static void reverseArray(int [] arr,int l){
        if(l>= arr.length/2) return;
        int temp=arr[l];
        arr[l]=arr[arr.length-l-1];
        arr[arr.length-l-1]=temp;
        reverseArray(arr,l+1);
    }
    public static int maxInArray(int [] arr,int max){
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int minInArray(int [] arr,int min){
        for(int i=0;i<arr.length;i++){
            if(min>=arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static int sumOfArray(int [] arr,int sum){
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        reverseArray(arr,0);
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println( maxInArray(arr,Integer.MIN_VALUE));
        System.out.println( minInArray(arr,Integer.MAX_VALUE));
        System.out.println(sumOfArray(arr,0));


    }
}
