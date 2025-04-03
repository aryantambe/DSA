package Basics;

public class pattern1 {
        public static void main(String[] args) {
            int n=4;
            int m=5;
            int k=1;
            //  rectangular box pattern
            for(int i=1;i<=4;i++){
                for(int j=1;j<=5;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
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
            }
            //half pyramid
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            //Reverse half pyramid
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            //180 degree inverted half pyramid
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){ //printing the spaces first
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            //half pyramid with numbers
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);

                }
                System.out.println();
            }

            //inverted half pyramid with numbers
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            //Floyd's triangle
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(k+" "); //we take a separate variable to print the numbers
                                        //and use j to count how many times k has to be printed
                    k++;
                }
                System.out.println();
            }
            //0-1 Triangle
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print(1+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }


        }
    }

