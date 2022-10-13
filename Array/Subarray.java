package Array;

public class Subarray {

    public static void printSubarray(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of subarrays is "+count);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printSubarray(arr);
    }
    
}
