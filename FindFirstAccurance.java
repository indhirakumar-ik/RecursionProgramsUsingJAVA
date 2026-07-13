public class FindFirstAccurance {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=6;
        int n=find(arr, 0, target);
        if(n==-1){
            System.out.println("element is not in the index");
        }else{
            System.out.println("the first accurance of the number is "+n);
        }
    }

    static int find(int[] arr,int index,int target){
        if(arr.length-1<index){
            return -1;
        }if(arr[index]==target){
            return index;
        }
        else{
            return find(arr, index+1, target);
        }
    }
}
