package Strings;

//Leetcode 20- Valid Parentheses
public class $Valid_parentheses {
    private static boolean easierQuestion(String s){ //if only () brackets are there
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else if(s.charAt(i)==')'){
                count--;
            }
        }
        if(count==0) return true;
        return false;
    }
    public static void main(String[] args) {
        String s="((())";
        System.out.println(easierQuestion(s));
    }
}
