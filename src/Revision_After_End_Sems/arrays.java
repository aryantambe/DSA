package Revision_After_End_Sems;

public class arrays {

    //swap function using xor operator

    // private static int[] swap(int n, int m){
    //     n=n^m;
    //     m=m^n;
    //     n=n^m;
    //     return new int[]{n,m};
    // }

    private static int factorial(int n){
        int fact=1;
        while(n!=0){
            fact*=n;
            n--;
        }
        return fact;
    }   //1,2,3,4,5    n-1-i
    private static void reverse(int [] arr){
        int n=arr.length;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i] =arr[n-1-i];
            arr[n-i-1]=temp;
        }
         for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // for (int e : arr) {
        //     System.out.print(e + " ");
        // }

        int result=factorial(5);
        System.out.println(result);

        int [] arr1={1,2,3,4,5};

        reverse(arr1);


    }
}
