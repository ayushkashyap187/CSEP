package arrays;

public class q_189 {
    public void rotate(int[] nums,int k){
        int  n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

    }

    static void reverse(int[] ar,int s,int e){
        while (s<=e) {
            int temp=ar[s];
            ar[s]=ar[e];
            ar[e]=temp;

            s++;
            e--;
        }
    }

}
