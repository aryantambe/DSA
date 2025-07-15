package Strings;


//Leetcode 205 
public class $9Isomorphic_Strings {

    private static boolean fn(String s, String t){
        if(s.length()!=t.length()) return false;

        int [] hash1=new int [256];
        int [] hash2=new int [256];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(hash1[c1]!=hash2[c2]) return false; //checking the prev included chars as indices in hash arrays

            hash1[c1]=i+1;//because we are storing indices and dont want confusion
            hash2[c2]=i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="acc";
        String t="zyx";
        System.out.println(fn(s, t));
    }
}
