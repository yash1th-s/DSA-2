package DivideNConquer;

public class QuickSort {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int start, int end){
        if(start>=end){
            return;
        }

        int pid = partition(arr, start, end);
        quickSort(arr, start, pid-1);
        quickSort(arr, pid+1, end);
    }

    public static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                int temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[++i];
        arr[i] = pivot;
        arr[end] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
