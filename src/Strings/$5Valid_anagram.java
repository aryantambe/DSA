package Strings;

import java.util.Arrays;
//leetcode 242
public class $5Valid_anagram {
    private static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char [] str1=s.toCharArray();
        char [] str2=t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

      if(!Arrays.equals(str1,str2)) return false;
        return true;
    }

    private static boolean isAnagramOptimal(String s, String t){
        if(s.length()!=t.length()) return false;
        int[] charHash=new int [26];
        for(int i=0;i<s.length();i++){
            charHash[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            charHash[s.charAt(i)-'a']--;
        }
        for(int e:charHash){
            if(e!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="margana";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagramOptimal(s, t));

    }
}
