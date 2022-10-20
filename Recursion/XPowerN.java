package Recursion;

public class XPowerN {

    public static int xPowerN(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfSquare = xPowerN(x, n/2) ;
        int Square = halfSquare * halfSquare;
        if(n%2 != 0){
            Square *= x;
        }
        return Square;
    }

    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(xPowerN(x, n));
    }
    
}
