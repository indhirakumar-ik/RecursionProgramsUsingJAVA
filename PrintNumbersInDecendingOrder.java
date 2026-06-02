public class PrintNumbersInDecendingOrder {
    public static void main(String[] args) {
        int start=5;
        int end=1;
        recursion(start,end);
    }

   public static void recursion(int start,int end){
        if(start==end){
            System.out.println(start);
            return;
        }
        System.out.println(start);
        recursion(start-1, end);
    }
}
