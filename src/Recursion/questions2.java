package Recursion;

import static java.util.Collections.swap;

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

    public static boolean checkStringPalindrome(String str,int size,int i){
        if(i>=size/2) return true;
        if(str.charAt(i)!=str.charAt(size-i-1)) return false;
        return checkStringPalindrome(str,size,i+1);
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
        int size=str.length();
        System.out.println(checkStringPalindrome(str,size,0));

    }
}
