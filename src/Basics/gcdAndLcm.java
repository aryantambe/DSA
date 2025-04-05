package Basics;

//This is a geeks for geeks problem
public class gcdAndLcm {
        public static int gcd(int a,int b){
            while(a>0 && b>0){
                if(a>b){
                    a=a%b;
                }
                else if(b>a){
                    b=b%a;
                }
            }
            if(a==0){
                return b;
            }
            else if(b==0){
                return a;
            }
            return 1;
        }
        public static int lcm(int a,int b){
            int gcd1=gcd(a,b);
            int lcm=(a*b)/gcd1;
            return lcm;
        }
        public static int[] lcmAndGcd(int a, int b) {

            // code here
            int n1=lcm(a,b);
            int n2=gcd(a,b);
            int[] arr={n1,n2};
            return arr;
        }
    }

