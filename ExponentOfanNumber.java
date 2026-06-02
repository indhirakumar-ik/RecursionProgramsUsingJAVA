public class ExponentOfanNumber {
    public static void main(String[] args) {
        int number=8;
        int Exponent=2;
        System.out.println(power(number,Exponent));
    }

    public static int power(int n,int target){
        if(target==1){
            return n;
        }
        else{
            return power(n,target-1)*n;
        }
    }
}
