package Basics;


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

    public static void main(String[] args) {
        //Extracting digits
        extractionAndCounting(7789);
        int soln=reverseNum(123);
        System.out.println(soln);
        int n=12345678;
        int count=(int)(Math.log10(n)+1);
        System.out.println(count);




    }
}
