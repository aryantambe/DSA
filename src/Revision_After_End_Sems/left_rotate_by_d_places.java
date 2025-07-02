package Revision_After_End_Sems;

public class left_rotate_by_d_places {

    private static int[] left_brute(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[d];
        if (d == 0 || d == n)
            return arr;
        d = d % n;

        for (int i = 0; i < d; i++) { // copying elements in the temp array
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) { // shifting the elements
            arr[i - d] = arr[i];
        }
        int index = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[index++];
        }

        return arr;

    }

    private static int[] right_brute(int [] arr, int d){
        int n=arr.length;
        int[] temp = new int[d];
        if (d == 0 || d == n)
            return arr;
        d = d % n;
        int k=0;
        for(int i=n-d;i<n;i++){
            temp[k++]=arr[i];
        }
        for(int i=n-1;i>=d;i--){  //1,2,3,4,5,6,7
            arr[i]=arr[i-d]; //when i and d is 0
        }
        int index=0;
        for(int i=0;i<d;i++){
            arr[i]=temp[index++];
        }
        return arr;
    }
    private static int [] reverse_helper(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
        
    }


    private static int [] optimal(int arr[],int d){

        int[] res=reverse_helper(arr, 0, d-1);
        res=reverse_helper(arr, d, arr.length-1);
        res=reverse_helper(arr, 0,arr.length-1);

        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
        int res[] = left_brute(arr, 3);
        System.out.println("Left Rotate using Brute Force :");
        for (int e : res) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("Right Rotate using Brute Force :");
        int res2[] = right_brute(arr1, 3);
        for (int e : res2) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("Left Rotate Optimal :");
        int res3[] = optimal(arr2, 3);
        for (int e : res3) {
            System.out.print(e + " ");
        }

    }
}
