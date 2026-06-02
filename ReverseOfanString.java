public class ReverseOfanString {
    public static void main(String[] args) {
        String name="java";
        reverse(name, name.length());
    }

    public static void reverse(String name,int n){
        if(n==0){
            return;
        }else{
            System.out.print(name.charAt(n-1));
            reverse(name, n-1);
        }
    }
}
