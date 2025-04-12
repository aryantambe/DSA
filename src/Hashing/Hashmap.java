package Hashing;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        //String-Key, Integer-Value
        HashMap<String,Integer> map=new HashMap<>();

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

    }
}
