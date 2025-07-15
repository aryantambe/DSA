package Strings;

//leetcode 1903
public class $6Largest_odd_number_in_string {

    private static String fn(String s){
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch-'0')%2!=0){
                return s.substring(0,i+1 );
            }
        }
        return "";
    } 
    public static void main(String[] args) {
        String s="242728";
        System.out.println(fn(s));
    }
}
