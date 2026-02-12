package arrays;


import java.util.Arrays;

public class missingNum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 7,0, 2};
        System.out.println(missingNumber(arr));
    }

    static int missing(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1){
                return i+1;
            }

        }
        return -1;
    }

    //optimised
    static int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum= n*(n+1)/2;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return expectedSum-sum;
    }
}
