package Revision_After_End_Sems;
import java.util.*;
public class second_largest {

    private static int brute(int [] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int max=arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=max){
                return arr[i];
            }
        }
        return -1;
    }

    private static int optimal(int [] arr){
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,5};
        int res=brute(arr);
        System.out.println(res);

        System.out.println(optimal(arr));
    }
    
}
