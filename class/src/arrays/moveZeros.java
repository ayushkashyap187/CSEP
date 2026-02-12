package arrays;

public class moveZeros {
    public static void main(String[] args) {

    }
    static void move(int[] arr){
        int i=0;
        int j= arr.length-1;

        while (i<=j) {
            if (arr[j] ==0){
                j--;
            }
            if (arr[i] != 0) {
                i++;
            }

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
