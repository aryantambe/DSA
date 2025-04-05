package Basics;

public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        int b=1;
        int a=1;

        int fib=0;
        if(n>=1){
            System.out.print(a+" ");
        }
        if(n>=2){
            System.out.print(b+" ");
        }

        for(int i=3;i<=n;i++){

            fib=a+b;
            System.out.print(fib+" ");
            a=b;
            b=fib;
        }
    }
}
