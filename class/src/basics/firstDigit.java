package basics;

public class firstDigit {
    public static void main(String[] args) {
        int n=9543;
        int ans=0;

       while (n>0){
//           n=n%10;
           ans=n%10;
           n/=10;
       }
        System.out.println(ans);
    }
}
