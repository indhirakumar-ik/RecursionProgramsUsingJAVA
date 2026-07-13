public class TrianglePatternUsingRecursion {
    public static void main(String[] args) {
        pattern(0, 0, 4);
    }

    static void pattern(int r,int c,int s){
        if(r==5){
            return;
        }
        if(r<s){
            System.out.print("0");
            pattern(r, c, s-1);
            System.out.print("*");
            pattern(r, c+1, s);
        }
        else{
            System.out.println();
            pattern(r+1, 0, s);
        }
    }
}
