package Array;

public class TrappingRainwater {

    public static int totalTrappedWater(int height[]){
        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        int totalWater = 0, trappedWater = 0, waterLevel = 0;
        for(int i=0; i<height.length;i++){
            waterLevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater = waterLevel - height[i];
            totalWater += trappedWater;
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(totalTrappedWater(height));
    }
    
}
