package Sorting;

public class Insertion_Sort {
    public static void insertionFunc(int [] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
    }
    public static void insertionRecursive(int[] arr, int i, int n) {
        // Base Case
        if (i == n) return; //no more elements left traversed the whole array
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionRecursive(arr, i + 1, n);
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insertionFunc(arr);
        insertionRecursive(arr,0,arr.length);
        for(int e:arr){
            System.out.println(e);
        }
    }

    }

