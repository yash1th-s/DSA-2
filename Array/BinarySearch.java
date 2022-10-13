package Array;

public class BinarySearch {

    public static int binarySearch(int arr[], int target){
        int lo = 0, hi = arr.length;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target)
                return mid;
            else if(target<arr[mid])
                hi = mid-1;
            else 
                lo = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        System.out.println(binarySearch(arr, target));
    }
}
