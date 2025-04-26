package Hashing;

import java.util.Scanner;

public class basic_hashing {
    public static void main(String[] args) {
      int [] arr={1,2,3,2,4,5,6};
      int n=arr.length;
        int[] hash=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("The hash Array is ");
        for(int e:hash){
            System.out.print(e+" ");
        }
        System.out.println("The number of times some elements appear are- ");
        System.out.println(hash[1]);
        System.out.println(hash[6]);

        String s="aabcdefghizzzzzaaady";
        int [] chHash=new int[26];
        for(int i=0;i<s.length();i++){
            chHash[s.charAt(i)-'a']+=1;
        }
        char charr='z';
        System.out.println(chHash[charr-'a']);
        System.out.println("The hash Array is ");
        for(int e:chHash){
            System.out.print(e+" ");
        }
}}
