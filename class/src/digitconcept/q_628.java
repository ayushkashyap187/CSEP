package digitconcept;

public class q_628 {
    public static void main(String[] args) {
        int[] a={-10,-4,-3,1,2,-8,-2,3,5};
        System.out.println(maximumProduct(a));
    }

    static int maximumProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        int n=nums.length;
        for (int i = 0; i < n; i++) {
            int num=nums[i];

            if (num>max1){
                max3=max2;

                max2=max1;
                max1=num;
            } else if (num>max2) {
                max3=max2;
                max2=num;

            }else if (num>max3){
                max3=num;
            }

            if (num<min1){
                min2=min1;
                min1=num;
            }else if (num<min2){
                min2=num;
            }
        }
        int a=max1*max2*max3;
        int b=min2*min1*max1;

        return Math.max(a,b);
    }
}
