package Recursion;

public class FirstAndLastOccur {
    public static void findOccurence(int arr[], int f, int l, int count, int key){
        if(count == arr.length){
            System.out.println(f+" "+l);
            return;
        }

        if(arr[count] == key){
            if(f == -1){
                f = count;
                l = count;
            }
            else
                l = count;
        }
        findOccurence(arr, f, l, count+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        findOccurence(arr, -1, -1, 0, 5);
    }
    
}
