package Sorting;

public class Bubble_Sort {

    public static void bubbleFunction(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubbleFunction(arr);
        for(int e:arr){
            System.out.println(e);
        }
    }
}
