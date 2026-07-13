public class GenerateAllsequence {
    public static void main(String[] args) {
        String str="ABCDE";
        generate(str, "", 0);
    }

    static void generate(String str,String ans,int index){
        if(index==str.length()){
            System.out.println(ans);
            return;
        }

        generate(str, ans, index+1);
        generate(str, ans+str.charAt(index), index+1);
    }
}
