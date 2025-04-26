package Hashing;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        //String-Key, Integer-Value
        HashMap<String,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();

        //insert
        map.put("India",100);
        map.put("China",120);
        map.put("Russia",10);
        // update
        map.put("India", 90);

        System.out.println(map);

        //search
        System.out.println(map.containsKey("China"));

        //Get Function
        System.out.println(map.get("China")); //gets the value of china
        System.out.println(map.get("Nepal")); //returns null

        int [] arr ={1,1,2,3,5,7,8,9};
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int freq=0;
            if(map1.containsKey(key)){
                freq=map1.get(key);
            }
            freq++;
            map1.put(key,freq);
        }
        System.out.println(map1.get(1));
        for(Map.Entry<Integer,Integer> ele:map1.entrySet()){
            System.out.println(ele.getKey()+"->"+ ele.getValue());
        }
        int []  nums={1,1,2,2,3,3,3,3};
        HashMap<Integer,Integer> mapp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key1=nums[i];
            mapp.put(key1,mapp.getOrDefault(key1,0)+1);
        }
        int max=0;
        int maxKey=nums[0];
       for(Map.Entry<Integer,Integer> ele:mapp.entrySet()){
           if(ele.getValue()>max){
               max=ele.getValue();
               maxKey= ele.getKey();
           }
       }
        System.out.println(maxKey);



    }
}
