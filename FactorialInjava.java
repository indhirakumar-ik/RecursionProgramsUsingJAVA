public class FactorialInjava{
    public static void main(String[] args) {
        int facNum=6;
        System.out.println(factorial(facNum));
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return factorial(n-1)*n;
        }
    }
}