package Strings;

public class $ValidPalindrome {
    private static boolean fn(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        StringBuilder sb = new StringBuilder();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetterOrDigit(charArr[i])) {
                sb.append(Character.toLowerCase(charArr[i]));
            }
        }
        String temp = sb.toString();
        String temp2 = sb.reverse().toString();
        if (temp.equals(temp2))
            return true;
        return false;
    }

    private static boolean twoPointers(String s) {
          int left = 0;
        int right = s.length() - 1;
        
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String t = "Hey there !@#$ my g ";
        System.out.println(fn(t));
        System.out.println(fn(s));
        System.out.println(twoPointers(t));     
        System.out.println(twoPointers(s));
    }
}
