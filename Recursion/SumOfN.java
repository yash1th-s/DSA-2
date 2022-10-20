package Recursion;

public class SumOfN {

    public static int sumOfN(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfN(n-1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOfN(n));
    }
    
}
