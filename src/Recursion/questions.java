package Recursion;

public class questions {
    static int sum=0;
    //first base case
    public static void printNTimes(int n){
        if(n==0) return;
        printNTimes(n-1);
        System.out.println(n);
    }
    //Second base case
    public static void printNTimes2(int i,int n){
        if(i>n) return;
        System.out.println(i);
        printNTimes2(i+1,n);
    }

    public static void backtrack1(int n){
        if(n==0) return;
        backtrack1(n-1);
        System.out.println(n);
    }
    public static void backtrack2(int n){
        if(n==0) return;
        System.out.println(n);
        backtrack2(n-1);
    }
    public static void sumOfNumbers(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        sumOfNumbers(num-1,sum+num);
    }
    public static void main(String[] args) {
       // printNTimes(10);
        //printNTimes2(1,10);
       // backtrack1(10);
       // backtrack2(10);
        sumOfNumbers(5,0);
    }
}
