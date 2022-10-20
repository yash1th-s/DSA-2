package Recursion;

public class NumInDecresing {


public static void decresingNums(int n){

    if(n==0) 
        return;

    System.out.print(n+" ");
    decresingNums(n-1);
}
    public static void main(String[] args) {
        int n = 10;
        decresingNums(n);
    }
    
}
