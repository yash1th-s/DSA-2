package BasicSorting;

public class InsertionSort {

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int currElem = arr[i];
            int id = i-1;
            while(id>=0 && currElem<arr[id]){
                arr[id+1] = arr[id];
                id--;
            }
            arr[id+1] = currElem;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        insertionSort(arr);
        printArray(arr);
    }
    
}
