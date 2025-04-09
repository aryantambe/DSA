package Sorting;

public class Selection_Sort {
    public static void selectionFunction(int [] arr){
        for(int i=0;i<arr.length-1;i++) {
            int min=i;
            for(int j=i;j<arr.length;j++){ //finding minimum
                if (arr[j] < arr[min]) {
                  min=j;
                }
            }
            //swapping with starting index
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionFunction(arr);
        for(int e:arr){
            System.out.println(e);
        }
    }
}
