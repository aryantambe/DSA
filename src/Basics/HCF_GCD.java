package Basics;

public class HCF_GCD {
    public static void meth1(int n1,int n2){
        int n=Math.min(n1,n2);
        int gcd=1;
        for(int i=1;i<=n;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println("The GCD of the numbers is "+gcd);
    }
    //A bit more optimised code
    public static void meth2(int n1,int n2){
        int n=Math.min(n1,n2);
        for(int i=n;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println("The GCD is "+i);
                break;
            }
        }
    }
    public static void euclideanAlgorithm(int n1,int n2){
        while (n1 > 0 && n2 > 0) {
            if(n1>n2){
                n1=n1%n2;
            } else if (n2>n1) {
                n2=n2%n1;
            }
        }
        if(n2==0){
            System.out.println("The HCF is "+n1);
        }
        else if(n1==0){
            System.out.println("The HCF is "+n2);
        }
    }
    public static void main(String[] args) {
        //Brute force method 1-
        meth1(36,12);
        //Brute force method 2-
        meth2(36,12);
        //Euclidean Algo-
        euclideanAlgorithm(36,12);
    }
}
