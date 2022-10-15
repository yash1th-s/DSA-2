package Array;
import java.util.*;

public class DuplicateElements {

    public static boolean isRepeated(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i]))
                return true;
            list.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(isRepeated(arr));
    }
}
