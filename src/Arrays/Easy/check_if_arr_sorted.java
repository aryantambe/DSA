package Arrays.Easy;

public class check_if_arr_sorted {
    public static boolean bruteForce(int [] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr={1,2,69,4,5};
        System.out.println(bruteForce(arr));

    }
}
