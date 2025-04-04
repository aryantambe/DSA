package Basics;
import java.util.Scanner;
public class functions {

   static void myName(){
        System.out.println("Aryan");
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int product(int a,int b){
        return a*b;
    }
    public static int factorial(int num){
       int fact=1;
       if(num<0){
           System.out.println("Error input");
           return 0;
       }
       for(int i=num;i>=1;i--){
           fact=fact*i;
       }
       return fact;
    }

    public static void main(String[] args) {
        myName();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a=sc.nextInt();
        System.out.println("Enter the second number ");
        int b=sc.nextInt();
        System.out.print("The sum is ");
        int sum=sum(a,b);
        System.out.println(sum);
        int prod=product(a,b);
        System.out.print("The product is ");
        System.out.println(prod);
        System.out.println("Enter the number to find factorial");
        int num=sc.nextInt();
        int fact=factorial(num);
        System.out.println("The factorial of "+ num+" is "+fact);
    }

    //Functions are stored in the memory as a stack
}
