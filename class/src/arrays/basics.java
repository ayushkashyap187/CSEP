package arrays;

public class basics {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        add(arr,2,6);
//        delete(arr,2);
//        System.out.println(oddSum(arr));
//        System.out.println(evenMul(arr));
    }
    static void add(int[] arr,int index,int n){
        int len= arr.length;

        for (int i = len-2; i >=index ; i--) {
            arr[i+1]=arr[i];
        }
        arr[index]=n;
        for (int i = 0; i <= len; i++) {
            System.out.println(arr[i]);
        }
    }

    static void delete(int[] arr,int index){
        int len= arr.length;
        for (int i = index; i < len-1; i++) {
            arr[i]=arr[i+1];
        }
        for (int i = 0; i < len-1; i++) {
            System.out.println(arr[i]);
        }
    }
    static int oddSum(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i=i+2) {
            ans+=arr[i];
        }
        return ans;
    }

    static int evenMul(int[] arr){
        int ans=1;
        for (int i = 1; i < arr.length; i=i+2) {
            ans *= arr[i];
        }
        return ans;
    }

}
