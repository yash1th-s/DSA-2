package ArrayList;
import java.util.*;

public class LonelyNumber {

    static int lonelyNum[] = new int[50];

    public static void findLonelyNums(int arr[]){
        Arrays.sort(arr);
        //printArray(arr);
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                if(arr[i+1] != arr[i]+1){
                    System.out.print(arr[i]+" ");
                }
            }
            else if(i == arr.length-1){
                if (arr[i-1] != arr[i]-1){
                    System.out.print(arr[i]+" ");
                }
            }
            else if(arr[i-1]!=arr[i]-1 && arr[i+1]!= arr[i]+1){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,6,5,8};
        findLonelyNums(arr);
        //printArray(lonelyNum);
    }
    
}
