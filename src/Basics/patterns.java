package Basics;

public class patterns {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        //rectangular box pattern
//        for(int i=1;i<4;i++){
//            for(int j=1;j<5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //hollow rectangle pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            System.out.println("checking");
            System.out.println();
            System.out.println();

        }
    }
}
