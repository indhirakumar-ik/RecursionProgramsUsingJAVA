public class FindTheArrayIsSortedorNot {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5,6};
        boolean b=helper(arr);
        if(b){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }

    static boolean helper(int arr[]){
        return Sorted(arr, 0);
    }

    static boolean Sorted(int arr[],int n){
        if(n==arr.length-1){
            return true;
        }
        return arr[n]<arr[n+1]&&Sorted(arr, n+1);
    }
}
