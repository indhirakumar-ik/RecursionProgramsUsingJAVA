public class FibanacciSeries {
    public static void main(String[] args) {
        int target=6;
        for(int i=0;i<=target;i++){
            System.out.println(recursion(i));
        }
    }

    public static int recursion(int n){
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }

        return recursion(n-1)+recursion(n-2);
    }
}
