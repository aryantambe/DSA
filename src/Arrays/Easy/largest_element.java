package Arrays.Easy;
import java.util.*;
public class largest_element {
    public static void largestNumberOptimal(int [] arr){
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int [] arr={5,4,56,2,1};
        Arrays.sort(arr);
        largestNumberOptimal(arr);
        System.out.println(arr[arr.length-1]);
    }
}
