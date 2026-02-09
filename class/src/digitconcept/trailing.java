package digitconcept;

public class trailing {
    public static void main(String[] args) {
        System.out.println(trailingZeros(5));
    }

    static int trailingZeros(int n) {
        int a = fact(n);
        int ans = 0;

        while (a % 10 == 0) {
            a /= 10;
            ans++;
        }
        return ans;
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * fact(n - 1);
    }
}

