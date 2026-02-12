package arrays;

public class isSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,41,5};

        System.out.println(isSort(arr));
    }
    static boolean isSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
