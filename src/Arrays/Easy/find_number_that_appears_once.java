package Arrays.Easy;

import com.sun.jdi.event.BreakpointEvent;

public class find_number_that_appears_once {
    private static int fn(int [] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count<2){
                res= arr[i];
            }

        }
        return res;
    }
    private static int opt(int [] arr){
        int xorr=0;
        for(int i=0;i<arr.length;i++){
            xorr=xorr^arr[i];
        }
        return xorr;
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,3,4,4,5,6,6,7,7};
        int result=fn(arr);
        System.out.println(result);
        int res=opt(arr);
        System.out.println(res);
    }
}
