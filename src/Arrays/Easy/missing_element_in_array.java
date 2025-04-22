package Arrays.Easy;

public class missing_element_in_array {
    public static int brute(int [] arr,int n){
        for(int i=0;i<arr.length;i++){
          if(arr[i]!=i+1){
              return i+1;
          }
        }
        return n;
    }
    public static int optSum(int [] arr,int n){
        int sum=(n*(n+1))/2;
        int s2=0;
        for(int i=0;i< arr.length;i++){
            s2+=arr[i];
        }
        return sum-s2;
    }
    public static void main(String[] args) {
    int [] arr={2,3,4,5,6,7,8,9,10,11,12,13,14};
    int res=brute(arr,14);
        System.out.println(res);

        int res1=optSum(arr,14);
        System.out.println(res1);

    }
}
