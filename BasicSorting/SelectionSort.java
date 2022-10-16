package BasicSorting;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minId = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minId])
                    minId = j;
            }
            int temp = arr[i];
            arr[i] = arr[minId];
            arr[minId] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 9, 15, 10, 4};
        selectionSort(arr);
        printArray(arr);
    }
    
}
