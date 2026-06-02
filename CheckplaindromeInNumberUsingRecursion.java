public class CheckplaindromeInNumberUsingRecursion {
    public static void main(String[] args) {
        int number=1;
        int n=palindrome(number);
        System.out.println(n);
        if(n==number){
            System.out.println("The number is a palindrome");

        }else{
            System.out.println("The number is not a palindrome");
        }
    }
    static int sum=0;
    static int palindrome(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
        return palindrome(n/10);
    }
}
