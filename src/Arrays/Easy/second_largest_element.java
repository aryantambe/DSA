package Arrays.Easy;
import java.util.*;
public class second_largest_element {
    public static void secondlargestBetter(int [] arr){
        int max=arr[0];
        int sl=-1; //in case there is no second largest
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sl && arr[i]!=max){
                sl=arr[i];
            }
        }
        System.out.println(sl);
    }
    public static void secondLargestOptimal(int [] arr){
        int max=arr[0];
        int sl=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                sl=max;
            }
            else if(arr[i]<max && arr[i]>sl){
                sl=arr[i];
            }
        }
        System.out.println(sl);
    }
    public static void main(String[] args) {
        int [] arr={5,5,4,3,2,1};
        //Brute Force Approach
//        Arrays.sort(arr);
//        int max=arr[arr.length-1];
//        int secondLargest=0;
//        for(int i= arr.length-2;i>=0;i--){
//            if(arr[i]!=max){
//                 secondLargest=arr[i];
//                 break;
//            }
//        }
//        System.out.println(secondLargest);
        secondlargestBetter(arr);
        secondLargestOptimal(arr);

    }
}
