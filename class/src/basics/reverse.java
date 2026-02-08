package basics;

public class reverse {
    public static void main(String[] args) {
        System.out.println(reversee(5235));
        System.out.println(palin(51215));
    }
    static int reversee(int n){
            int ans=0;

            while (n>0){
                ans=(ans*10) + (n%10);
                n/=10;
            }
            return ans;
    }

    static boolean palin(int n){
        if (n==reversee(n)){
            return true;
        }
        return false;
    }
}
