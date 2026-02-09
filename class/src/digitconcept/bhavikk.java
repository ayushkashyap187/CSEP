package digitconcept;

public class bhavikk {
    public static void main(String[] args) {
        int n=9474,count=0,sum=0;
        int temp=n;
        int temp2=n;

        while (n>0)
        {
            n/=10;
            count++;
        }
        while (temp>0)
        {
            int digit=temp%10;
            sum+=Math.pow(digit,count);
            temp/=10;
        }
        if (sum==temp2)
        {
            System.out.println("is digitconcept.armstrong");
        }else{
            System.out.println("no digitconcept.armstrong");
        }

    }
}
