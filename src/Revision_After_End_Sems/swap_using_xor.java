package Revision_After_End_Sems;

public class swap_using_xor {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println("a:" +a +"b:"+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:" +a +"b:"+b);
        

    }
}
