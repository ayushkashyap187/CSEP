package digitconcept;

public class count {
    public static void main(String[] args) {
        int n=8596;
        int count=0;

        while (n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
