package arrays;

public class q_1295 {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
        System.out.println(even(100000));
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) count++;
        }
        return count;
    }
    static boolean even(int a){

        int count = 0;
        while (a>0) {

            a /= 10;
            count++;

        }
        if (count%2==0) return true;
        return false;
    }
}
