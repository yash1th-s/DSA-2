package Array;

public class MaxSubarraySum {

    //Brute force 
    public static int maxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static int prefixSum(int arr[]){
        int prefixSum[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            prefixSum[i] = sum;
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum = i==0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static int kadaneAlgorithm(int arr[]){
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        System.out.println(maxSubarraySum(arr));
        System.out.println(prefixSum(arr));
        System.out.println(kadaneAlgorithm(arr));
    }
    
}
