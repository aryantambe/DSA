package Strings;
                                                                                                                                                               
public class $ValidPalindrome {
    private static boolean fn(String s){
        if(s.length()==0 || s.length()==1) return true;
        StringBuilder sb=new StringBuilder(); 
        char [] charArr=s.toCharArray();
        for(int i=0;i<charArr.length;i++){
           if(Character.isLetterOrDigit(charArr[i])){
            sb.append(Character.toLowerCase(charArr[i]));
           }
        }
        String temp=sb.toString();
        String temp2=sb.reverse().toString();   
        if(temp.equals(temp2)) return true;
        return false;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        String t="Hey there !@#$ my g ";
        System.out.println(fn(t));
        System.out.println(fn(s));
    }
}
