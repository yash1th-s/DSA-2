package Recursion;

public class FibonacciNumber {

    public static int fibonacciNumber(int n, int a, int b){

        if(n==0){
            System.out.println(b+" ");
            return b;
        }
        System.out.print(a+" ");
        return fibonacciNumber(n-1, b, a+b);
        
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacciNumber(n, 0, 1));
    }
    
}
