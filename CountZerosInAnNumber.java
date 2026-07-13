public class CountZerosInAnNumber {
    public static void main(String[] args) {
        int number=10001;
        System.out.println("Number of zeros in "+number+" is "+count(number));
    }
    static int zero=0;
    static int count(int n){
        if(n==0){
            return zero;
        }
        int rem=n%10;
        if(rem==0){
            zero++;
        }
        return count(n/10);
    }
}
