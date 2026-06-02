public class ReverseAnumberusingRecursion {
    public static void main(String[] args) {
        int number=1234;
        System.out.println("the reverse of the number is "+reverse(number));
    }
    static int sum=0;
    static int reverse(int number){
        if(number==0){
            return sum;
        }
        int rem=number%10;
        sum=sum*10+rem;
        return reverse(number/10);
    }
    
}
