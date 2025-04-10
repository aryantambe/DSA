package Arrays.Easy;
import java.util.*;
public class second_largest_element {
    //public static void secondlargest(int [] arr){

   // }
    public static void main(String[] args) {
        int [] arr={5,5,4,3,2,1};
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int secondLargest=0;
        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]!=max){
                 secondLargest=arr[i];
                 break;
            }
        }
        System.out.println(secondLargest);

    }
}
