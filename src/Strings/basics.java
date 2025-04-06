package Strings;

import java.util.Scanner;

public class basics {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        System.out.println(name);
//        String ans=sc.nextLine();
//        System.out.println(ans);
        String firstName="Aryan";
        String lastName="Tambe";
        String fullname=firstName.concat(lastName);
        System.out.println(fullname);
        System.out.println(fullname.length());
        for(int i=0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i)+" ");
        }
        System.out.println("\n"+firstName.compareTo(lastName));

        StringBuilder sb=new StringBuilder("Tung Tung Tung Sahur");
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'B');
        System.out.println(sb);
        sb.insert(3,"Aryan");
        System.out.println(sb);
        sb.delete(3,8);
        System.out.println(sb);
        sb.append("rrr");
        System.out.println(sb);
        System.out.println(sb.length());

        StringBuilder rev=new StringBuilder("hello");
        for(int i=0;i<rev.length()/2;i++){
            int front=i;
            int back=rev.length()-1-i; //0->4,1->3,2->2

            char frontChar=rev.charAt(front);
            char backChar=rev.charAt(back);

            rev.setCharAt(front,backChar);
            rev.setCharAt(back,frontChar);

        }
        System.out.println(rev);

        String str = "hello";
        char[] arr = str.toCharArray(); // Convert string to char array

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Printing reversed string
        for (char c : arr) {
            System.out.print(c);
        }



    }
}
