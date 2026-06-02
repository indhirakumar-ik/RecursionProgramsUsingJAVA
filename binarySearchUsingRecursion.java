public class binarySearchUsingRecursion {
    public static void main(String[] args) {
        int a[]={3,4,5,6,9,8};
        int first=0;
        int target=5;
        int end=a.length;
        Binary(target, a, first, end);
    }

    static void Binary(int target,int arr[],int start,int end){

        if(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("element in the array");
                return;
            }
            else if(arr[mid]<target){
                Binary(target, arr, start+1, end);
            }else{
                Binary(target, arr, start, end-1);
            }
        }

    }
}
