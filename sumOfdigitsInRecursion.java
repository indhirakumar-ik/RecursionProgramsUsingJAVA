public class sumOfdigitsInRecursion {
    public static void main(String[] args) {
        int n=123419;
        System.out.println("count of digit = "+sum(n));
    }

    static int sum(int number){
        if(number==0){
            return number;
        }
        int rem=number%10;
        return rem+sum(number/10);

    }

}
