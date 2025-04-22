package Arrays.Easy;

import java.util.TreeSet;

public class intersection_of_arrays {
    public static int [] fn(int [] nums1,int [] nums2){
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        int [] arr=new int[set.size()];
        int k=0;
        for(int el:set){
            arr[k++]=el;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] nums1={1,2,3,4,5,6,7};
        int [] nums2={1,2,9};
        int [] arr=fn(nums1,nums2);
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
