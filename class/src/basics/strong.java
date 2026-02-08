package basics;

public class strong {
    public static void main(String[] args) {
        System.out.println(isStrong(145));
    }
    static boolean isStrong(int n){
        int temp=n;
        int ans=0;

        while (n>0){
            int digit = n % 10;
            ans+=fact(digit);
            n/=10;
        }

        if (ans==temp){
            return true;
        }
        return false;
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * fact(n - 1);
    }
}
