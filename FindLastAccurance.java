public class FindLastAccurance {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,4};
        int target=4;
        int n=find(arr, arr.length-1, target);
        if(n==-1){
            System.out.println("element is not in the index");
        }else{
            System.out.println("the last accurance of the number in the array is "+n);
        }
    }

    static int find(int arr[],int index,int target){
        if(arr.length<0){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return find(arr, index-1, target);
        }
    }
}
