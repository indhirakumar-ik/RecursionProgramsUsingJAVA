public class CheckPalindrome {
    public static void main(String[] args) {
        String name="mam",temp="";
        int length=name.length();
        String n=Palindrome(name,length,temp);
        if(name.equals(n)){
            System.out.println("its a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        System.out.println("name = "+n);
    }

    static String Palindrome(String name,int n,String temp){
        if(n<=0){
            return "";
        }else{
            return temp+name.charAt(n-1)+Palindrome(name,n-1,temp);
        }
    }
}
