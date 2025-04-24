package Arrays.Medium;


public class Longest_subarray_with_sum_k_positive {
    private static int  bruteForce(int [] arr,int k){
        int maxx=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                int sum=0;
                for(int l=i;l<=j;l++){
                    sum=sum+arr[l];

                }
                if(sum==k){
                    maxx=Math.max(maxx,j-i+1);
                }
            }
        }
        return maxx;

    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,1,1,1,4,2,3};
        int len=bruteForce(arr,3);
        System.out.println(len);
    }
}
