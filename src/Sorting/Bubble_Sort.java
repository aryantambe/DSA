package Sorting;

public class Bubble_Sort {

    public static void bubbleFunction(int [] arr){
        int didSwap=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
    }
    public static void bubbleRecursive(int [] arr,int n){
        if(n==1) return;
        int didSwap=0;
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                didSwap=1;
            }
        }
        if(didSwap==0){
            return;
        }
        bubbleRecursive(arr,n-1);

    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubbleFunction(arr);
        bubbleRecursive(arr, arr.length);
        for(int e:arr){
            System.out.println(e);
        }
    }
}
