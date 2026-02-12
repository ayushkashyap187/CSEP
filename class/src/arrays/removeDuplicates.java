package arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,5,6};
        removeDup(arr);
    }
    static void removeDup(int[] arr){
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            if (arr[i] != arr[j]){
                i++;
                arr[i] =arr[j];
                j++;
            }else {
                j++;
            }
        }
        for (int k = 0; k < i+1; k++) {
            System.out.println(arr[k]);
        }
    }
}
