package BitManipulation;

public class NumOfSetBits {

    public static void countSetBits(int n){
        int count = 0, bitMask = 1;
        while(n != 0){
            if((n&bitMask) == 1) 
                count++;
                n = (n>>1);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 9;
        countSetBits(n);
    }
    
}
