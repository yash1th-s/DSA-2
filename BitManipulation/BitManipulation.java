package BitManipulation;

public class BitManipulation {

    public static int getBit(int n, int pos){
        int bitMask = 1<<pos;
        if((n&bitMask) == 0){
            System.out.println("0");
            return 0;
        }
        else{
            System.out.println("1");
            return 1;
        }
    }

    public static void setBit(int n, int pos){
        int bitMask = 1<<pos;
        int res = (n|bitMask);
        System.out.println(res);
        return ;
    }

    public static void clearBit(int n, int pos){
        int bitMask = ~(1<<pos);
        int res = (n&bitMask);
        System.out.println(res);
    }

    public static void updateBit(int n, int pos){
        if(getBit(n, pos) == 0){
            setBit(n, pos);
        }else{
            clearBit(n, pos);
        }
    }

    public static void clearLastiBits(int n, int pos){
        int bitMask = (-1)<<pos;
        int res = (n&bitMask);
        System.out.println(res);
    }

    public static void clearRangeOfBits(int n, int start, int end){
        int a = (-1)<<(end+1);
        int b = (1<<start)-1;
        int bitMask = (a|b);
        int res = (n&bitMask);
        System.out.println(res);
    }

    public static void main(String[] args) {
        int n = 10, pos = 2;
        getBit(n, pos);
        setBit(n, pos);
        clearBit(n, 1);
        clearLastiBits(15, 2);
        clearRangeOfBits(10, 2, 4);
    }
    
}
