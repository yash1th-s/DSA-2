package Array;

public class LargestInArray {

    public static int getLargest(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }

    public static int getSmallest(int nums[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 6, 3, 5};
        System.out.println(getLargest(nums));
        System.out.println(getSmallest(nums));
    }
}
