public class countDigitsusingRecursion {
    public static void main(String[] args) {
        int number=123456;
        System.out.println("the digits of the number is "+count(number) );
    }

    static int count(int number){
        if(number==0){
            return 0;
        }
        return 1+count(number/10);
    }
}
