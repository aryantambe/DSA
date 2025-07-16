package Strings;
import java.util.*;
//Leetcode 20- Valid Parentheses
public class $8Valid_parentheses {
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

    private static boolean leetcode20(String s){
        Stack<Character> stack=new Stack<>();
        char [] charArray=s.toCharArray();
        for(char e:charArray){
            if(e=='(' || e=='{' || e=='['){
                stack.push(e);
            }
            else{
                if(stack.isEmpty()) return false;

                char top=stack.pop();
                if((e==')' && top!='(') ||
                    (e=='}' && top!='{') ||
                    (e==']' && top!='[')){
                        return false;
                    }
            }
           
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s="((()))";
        System.out.println(easierQuestion(s));
        System.out.println(leetcode20(s));
    }
}
