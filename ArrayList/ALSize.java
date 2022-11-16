package ArrayList;

import java.util.ArrayList;

public class ALSize {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(103);
        list.add(12);
        list.add(56);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
    
}
