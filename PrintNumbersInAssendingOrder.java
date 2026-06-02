public class PrintNumbersInAssendingOrder{
    public static void main(String[] args) {
        int start=1;
        int target=6;
        recursion(start,target);
    }
     
   public static void recursion(int n,int target){
        if(n==target){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursion(n+1, target);
    }

}