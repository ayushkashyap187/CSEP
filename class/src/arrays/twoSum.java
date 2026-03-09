package arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr={1,4,2,6,9,8};
        System.out.println(twosumm(arr,8));
    }

    static boolean twosumm(int[] arr,int target){
        int i=0;
        int j=arr.length-1;

        while (j>i) {
            if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
