package ArrayList;
import java.util.*;

public class ContainingMaxWater {

    public static int maxWaterStored(ArrayList<Integer> heights){
        int lp=0, rp=heights.size()-1;
        int maxWater = Integer.MIN_VALUE; 

        while(lp<rp){
            int height = Math.min(heights.get(lp), heights.get(rp));
            int width = rp - lp;
            int water = height * width;
            maxWater = Math.max(water, maxWater);

            if(heights.get(lp) < heights.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxWaterStored(list));
    }
    
}
