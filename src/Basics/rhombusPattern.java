package Basics;

public class rhombusPattern {
    public static void main(String[] args) {
        //Solid Rhombus
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        //Hollow Rhombus
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                if(i==1||k==1||i==n||k==n)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
