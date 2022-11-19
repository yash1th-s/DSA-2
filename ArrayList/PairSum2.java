package ArrayList;

public class PairSum2 {

    public static void findPair(int arr[], int target){
        int pivot=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                pivot = i;
                System.out.println(i);
                break;
            }
        }

        int lp = pivot, rp = pivot-1;
        while(lp!=rp){
            if(arr[lp]+arr[rp] == target){
                System.out.println(lp+" "+rp);
                return;
            }
            else if(arr[lp]+arr[rp]<target){
                lp++;
            }else{
                rp--;
            }
            if(rp == -1){
                rp = arr.length-1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int target = 20;
        findPair(arr, target);
    }
    
}
