package Recursion;

public class TilingProblem {

    public static int fillingTiles(int n){
        if(n==0 || n==1){
            return 1;
        }

        int vertical = fillingTiles(n-1);

        int horizontal = fillingTiles(n-2);

        int total = vertical + horizontal;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(fillingTiles(4));
        
    }
    
}
