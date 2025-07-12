package Strings;

public class $2CheckPalindrome {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("namana");
        String og=str.toString();
        str.reverse();
        if(str.toString().equals(og)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        

    }
}
