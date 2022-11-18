package ArrayList;

public class PairSum {

    public static void findPairs(int arr[], int target){
        int lp = 0, rp = arr.length-1;

        while(lp<rp){
            if(arr[lp]+arr[rp] == target){
                System.out.println(lp+" "+ rp);
                break;
            }
            else if(arr[lp]+arr[rp] < target){
                lp++;
            }
            else{
                rp--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 5;
        findPairs(arr, target);
    }
    
}
