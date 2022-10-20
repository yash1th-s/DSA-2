package Recursion;

public class Factorial {

    public static int printFactorial(int n){

        if(n==0 || n==1){
            return 1;
        }

        return n*printFactorial(n-1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(printFactorial(n));
    }
    
}
