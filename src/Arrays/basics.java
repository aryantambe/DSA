package Arrays;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size=sc.nextInt();
        int[] arr =new int[size];

        //taking inputs
        System.out.println("Enter the elements of the array");
       for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println("Enter the number to be searched ");
       int val=sc.nextInt();
       //accessing the array to find the searched value
       for(int i=0;i<size;i++){
           if(val==arr[i]){
               System.out.println("The index of the searched number is ");
               System.out.print(i);
           }
       }


    }
}
