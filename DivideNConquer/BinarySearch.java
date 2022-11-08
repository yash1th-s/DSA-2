package DivideNConquer;

public class BinarySearch {

    public static int search(int arr[], int target){
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<=target)
                lo = mid+1;
            else 
                hi = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 15, 17};
        System.out.println(search(arr, 10));
    }
    
}
