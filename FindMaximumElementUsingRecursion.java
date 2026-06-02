public class FindMaximumElementUsingRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,10,4,40,6};
        int max=arr[0];
        System.out.println("The maximum of number in the array is "+find(arr, 0,max));
    }

    static int find(int arr[],int n,int max){
        if(arr[n]>max){
            max=arr[n];
        }
        if(n==arr.length-1){
            return max;
        }
        return find(arr, n+1,max);
    }
}
