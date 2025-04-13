package Arrays.Easy;

public class linear_search {
    //return the index of the target that is given
  public static int fn(int [] arr,int target){
      for(int i=0;i<arr.length;i++){
          if(arr[i]==target){
              return i;
          }
      }
      return -1;
  }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5};
        int index=fn(arr,2);
        System.out.println("The index at which the element is found is ");
        System.out.println(index);
    }
}
