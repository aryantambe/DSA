package Basics;
public class reverse_number {
    public static void main(String[] args) {
        int num=123;
        System.out.println(num);
         int  rev=0;
        while(num>0){
            int  t=num%10;
            rev=(rev*10)+t;
            num=num/10;
        }
        System.out.println(rev);
    }
}



