package digitconcept;

public class palindromepermutation {
    public static void main(String[] args) {
        System.out.println(canFormPalindrome(0000));
    }
    static boolean canFormPalindrome(int num) {

        int oddCount = 0;
        for (int d = 0; d <= 9; d++) {

            int count = 0;
            int temp = num;

            while (temp > 0) {
                if (temp % 10 == d) {
                    count++;
                }
                temp /= 10;
            }
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        return true;
    }

}
