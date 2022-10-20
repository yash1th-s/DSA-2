package Recursion;

public class SortedArray {

    public static boolean isSorted(int arr[]){
        Boolean increasing = true, decreasing = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]) 
                decreasing = false;
            else if(arr[i]>arr[i+1]) 
                increasing = false;
        }
        return increasing||decreasing;
    }

    public static void main(String[] args) {
        int arr[] = {9, 6, 4, 2, 1, 0};
        System.out.println(isSorted(arr));
    }
    
}
