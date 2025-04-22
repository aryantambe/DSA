package Arrays.Easy;

public class max_consecutive_ones {
    public static int brute(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1};
        int max_ones = brute(arr);
        System.out.println(max_ones);
    }
}
