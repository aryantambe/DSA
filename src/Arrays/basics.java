package Arrays;

import java.util.Scanner;

public class basics {
    public static void reverseArray(int[] arr){
        for(int i=0;i<=arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }

    }



    public static void revArray(int arr []){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        //taking inputs
//        System.out.println("Enter the elements of the array");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the number to be searched ");
//        int val = sc.nextInt();
//        //accessing the array to find the searched value
//        for (int i = 0; i < size; i++) {
//            if (val == arr[i]) {
//                System.out.println("The index of the searched number is ");
//                System.out.print(i);
//            }
//        }

        //2D array
//        int row = 3;
//        int column = 5;
//        int [][] matrix=new int[row][column];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        int [] arr={1,2,3,4,5};
        reverseArray(arr);


    }
}
