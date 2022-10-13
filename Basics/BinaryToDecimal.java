package Basics;
import java.util.*;

public class BinaryToDecimal {

    public static int binaryToDecimal(int n){
        int sum = 0; int count = 0;
        while(n!=0){
            sum += n%10 * (int)Math.pow(2, count);
            count++;
            n = n/10; 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any binary number:");
        int n = sc.nextInt();
        int res = binaryToDecimal(n);
        System.out.println(res);
        sc.close();
    }
}
