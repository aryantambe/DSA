package Arrays.Easy;
import java.util.*;
public class remove_duplicates {
    public static int bruteForce(int [] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int k=set.size();
        int i=0;
        for(int e:set){
            arr[i]=e;
            i++;
        }
        return k;
    }
    public static void optimal(int [] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,3};
        int noOfUniqueValues= bruteForce(arr);
        System.out.println("The array after removing duplicates is- ");
        for(int i=0;i<noOfUniqueValues;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the number of unique values are- "+noOfUniqueValues);
        int[] arr1={1,1,1,1,2,2,2,2,3,3,3,3,};
        optimal(arr1);
    }
}
