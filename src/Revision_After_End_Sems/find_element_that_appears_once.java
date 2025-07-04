package Revision_After_End_Sems;
import java.util.*;
public class find_element_that_appears_once {

    private static int hashMapTechnique(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return 0;
    }
     private static int optimalXOR(int [] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
     }
    public static void main(String[] args) {
        int arr[] ={1,1,2,2,3,3,4,4,5};
        System.out.println(hashMapTechnique(arr));
        System.out.println(optimalXOR(arr));
    }
}
