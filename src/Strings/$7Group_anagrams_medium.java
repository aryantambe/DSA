package Strings;

import java.util.*;

public class $7Group_anagrams_medium {
    private static List<List<String>> fn(String [] strs){
       if(strs.length==0) return new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char [] chars=s.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }   
            map.get(sorted).add(s);
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> group: map.values()){
            result.add(group);
        }
        return result;
    }
    public static void main(String[] args) {
        String [] str={"eat","tea","tan","ate","nat","bat"};
        System.out.println(fn(str));
    }
}
