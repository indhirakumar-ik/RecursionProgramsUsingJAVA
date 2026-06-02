public class FindTheElementIntheArrayUsingRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int target=10;
        int n=Find(arr, 0, target);
        System.out.println(n);
        if(n==target){
            System.out.println("target is finded");
        }else{
            System.out.println("element is not in the index");
        }
    }

    static int Find(int arr[],int n,int target){
        if(n>arr.length-1){
            return -1;
        }
        if(arr[n]==target){
            return arr[n];
        }
        return Find(arr, n+1, target);
    }
}
