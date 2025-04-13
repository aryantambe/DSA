package Arrays.Easy;

public class left_rotate_by_D_places {
    public static void bruteForce(int [] arr, int d){
        int n=arr.length;
        if(d==0||d%n==0) return;
        d=d%n;
        int [] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]= arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];   //1,2,3,4,5,6,7
                                  //4,5,6,7,1,2,3
        }
    }
    public static void optimal(int[] arr,int k){
        int n=arr.length;
        if(k==0||k%n==0) return;
        k=k%n;
        rev(0,k-1,arr);
        rev(k,n-1,arr);
        rev(0,n-1,arr);

    }
    private static void rev(int start,int end,int [] arr){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        bruteForce(arr,3);
        for(int e: arr){
            System.out.print(e+" ");
        }
        int[] arr1={1,2,3,4,5,6,7};
        optimal(arr1,3);
        System.out.println();
        for(int e: arr1){
            System.out.print(e+" ");
        }
    }
}
