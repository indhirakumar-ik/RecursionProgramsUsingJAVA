public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        int number=6;
        System.out.println(Natural(number));
    }
    public static int Natural(int n){
        if(n==1){
            return n;
        }else{
            return Natural(n-1)+n;
        }
    }
}
