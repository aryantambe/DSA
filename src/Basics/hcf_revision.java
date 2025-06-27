package Basics;

public class hcf_revision {

    private static int brute(int n1,int n2){
        int gcd=1;
        int n=Math.min(n1,n2);
        for(int i=1;i<=n;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int res=brute(9, 12);
        System.out.println(res);
    }
}
