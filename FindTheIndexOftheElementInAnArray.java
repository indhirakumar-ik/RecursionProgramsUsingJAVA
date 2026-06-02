public class FindTheIndexOftheElementInAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=1;
        int n=find(arr, 0, target);
        if(n==-1){
            System.out.println("Element is not in the array");
        }else{
            System.out.println("Element is found in the index of "+n);
        }
    }

    static int find(int arr[],int n,int target){
        if(n>arr.length-1){
            return -1;
        }
        if(arr[n]==target){
            return n;
        }

        return find(arr, n+1, target);
    }
}
