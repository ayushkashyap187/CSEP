package digitconcept;

public class armstrong {
    static boolean isArmstrong(int n) {
        int temp=n;
        int ans=0;
        while (n > 0) {

            int digit = n % 10;
            int pow=digitCount(temp);

            ans+=Math.pow(digit,pow);
            n/=10;
        }
        if(ans==temp){
            return true;
        }
        return false;
    }

    static int digitCount(int n){
        int count=0;

        while (n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(9474));



    }


}
