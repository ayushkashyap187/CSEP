package basics;

import java.util.Arrays;

public class maxMul {
    public static void main(String[] args) {
        int[] a={-10,-4,-3,1,2,2,3,5};
        System.out.println(max(a));
    }
    static int max(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int temp=1;
        if (n>3) {
            int a = arr[0] * arr[1] * arr[n - 1];
            int b = arr[n - 3] * arr[n - 2] * arr[n - 1];
            if (a > b) {
                return a;
            }else {
                return b;
            }
        }else {
            for (int i = 0; i < n; i++) {
                temp *=arr[i];
            }
        }
        return temp;
    }
}
