package Basics;
import java.util.*;

public class SumOfDigits {

    public static int sumOfDig(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int n = sc.nextInt();
        int res = sumOfDig(n);
        System.out.println(res);
        sc.close();
    }
    
}
