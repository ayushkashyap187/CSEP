package arrays;

public class q_268 {
    static int missingNumber(int[] nums) {
        int n=nums.length;
        int reqSum=(n*(n+1))/2;

        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=nums[i];
        }
        return reqSum-sum;
    }
}
