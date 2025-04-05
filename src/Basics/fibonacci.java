package Basics;

public class fibonacci {
    public static void main(String[] args) {
//        int n=6;
//        int b=1;
//        int a=1;
       int size=3;
//
//        int fib=0;
//        if(n>=1){
//            System.out.print(a+" ");
//        }
//        if(n>=2){
//            System.out.print(b+" ");
//        }
//
//        for(int i=3;i<=n;i++){
//
//            fib=a+b;
//            System.out.print(fib+" ");
//            a=b;
//            b=fib;
//        }

        for(int i=1;i<=size;i++){
            for(char j='A';j<='A'+(i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(char i='A';i<='A'+size;i++){
            for(int  j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
