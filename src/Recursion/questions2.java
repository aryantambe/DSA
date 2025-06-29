package Recursion;


public class questions2 {
    //using 2 pointers
    public static void reverseArray1(int[] arr, int l, int r){
        if(l>=r) return;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverseArray1(arr, l+1, r-1);
    }
    //A more optimised method using only one pointer instead of 2
    public static void reverseArray2(int i,int n,int [] arr){
        if(i>=n/2) return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverseArray2(i+1,n,arr);
    }

    public static boolean checkStringPalindrome(String str,int i){
        if(i>=str.length()/2) return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
        return checkStringPalindrome(str,i+1);
    }
    public static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int n=arr.length;
        reverseArray1(arr,0,n-1);
        reverseArray2(0,n,arr);
        for(int element:arr){
            System.out.print(element);
        }
        System.out.println();
        String str="naman";
        System.out.println( checkStringPalindrome(str,0));
        System.out.println(fibonacci(6));

    }
}
