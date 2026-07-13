public class ProductOfDigits {
    public static void main(String[] args) {
        int number =123456789;
        System.out.println("the number of count is "+product(number, 1));
    }

    static int product(int n,int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        count=count*rem;
        return product(n/10, count);
    }
}
