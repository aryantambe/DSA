package Basics;

import static java.lang.Math.sqrt;

public class basicMaths {
    public static void extractionAndCounting(int num) {
        int k = 0;
        int count =0;
        while (num > 0) {
            k = num % 10;
            System.out.println(k);
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
    public static int reverseNum(int num){
        int rev=0;
        int t=0;
        while(num>0){
            t=num%10;
            rev=(rev*10)+t;
            num=num/10;
        }
        return rev;
    }
    public static void armstrongNumber(int num){
        int dupe=num;
        int k=0;
        int sum=0;
        int count=0;
        int temp = num;

        // Count the number of digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        while(num>0){
            k=num%10;
            sum+= (int) Math.pow(k,count);
            num=num/10;
        }
        if(sum==dupe){
            System.out.println("Its a Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }
    //Pair divisor
    public static void PrintDivisors(int num){
        for(int i=1;i<Math.sqrt(num);i++){
            if(num%i==0){
                System.out.print(i+" ");
                if((num/i)!=i){
                    System.out.println(num/i+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        //Extracting digits
        extractionAndCounting(7789);
        int soln=reverseNum(123);
        System.out.println(soln);
        int n=12345678;
        int count=(int)(Math.log10(n)+1);
        System.out.println(count);
        armstrongNumber(9474);
        PrintDivisors(36);




    }
}
