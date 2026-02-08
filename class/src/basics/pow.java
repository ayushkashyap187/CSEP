package basics;

public class pow {
    public static void main(String[] args) {
        System.out.println(pow(5,3));

    }

    static int pow(int a,int b){
        int ans=a;
        for (int i = 1; i < b; i++) {
            ans =ans*a;
        }
        return ans;
    }
}
