package Hashing;

public class revision {  //how many times 
    public static void main(String[] args) {
         int [] arr={1,2,3,4,4,5,6,6,8,9,1,1,1};
         int [] hash=new int[13];
         for(int i=0;i<hash.length;i++){
            System.out.println(hash[i]);
         }
         for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;   //hash ka index is arr ke elements
         }
         for(int e: hash){
            System.out.print(e+" ");
         }
         System.out.println();
         System.out.println("The number of times 1 appears in arr "+hash[1]);
    }
}
