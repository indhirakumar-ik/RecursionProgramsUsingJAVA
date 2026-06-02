public class findTheElementUsingrecursiveBinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=1;
        int n=Binary(arr, 0, arr.length-1, target);
        if(n==-1){
            System.out.println("Element is not in the array");
        }else{
            System.out.println("element was found in the index of "+n);
        }
    }

    static int Binary(int arr[],int first,int last,int target){
        if(last<first){
            return -1;
        }
        int mid=first+(last-first)/2;

        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            return Binary(arr, first+1, last, target);
        }else{
            return Binary(arr, first, last-1, target);
        }
    }
}
