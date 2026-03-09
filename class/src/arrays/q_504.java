package arrays;

public class q_504 {
    public String convertToBase7(int num) {

        if (num==0){
            return "0";
        }

        String ans="";
        boolean negative=false;

        if (num<0){
            negative=true;
            num=-num;
        }

        while (num>0) {
            ans = num % 7 + ans;
            num = num / 7;
        }

        if (negative){
            ans="-"+ans;
        }

        return ans;
    }
}
