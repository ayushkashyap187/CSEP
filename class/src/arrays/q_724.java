package arrays;

public class q_724 {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (leftSum(nums,i)==rightSum(nums,i)){
                return i;
            }
        }
        return -1;
    }
    static int leftSum(int[] nums,int index){
        int sum=0;
        int n=0;
        while (n != index){
            sum+=nums[n++];
        }
        return sum;
    }
    static int rightSum(int[] nums,int index){
        int sum=0;
        int n=nums.length-1;

        while (n!=index){
            sum+=nums[n--];
        }
        return sum;
    }
}
