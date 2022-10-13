package Basics;
import java.util.*;

public class DecimalToBinary {

    public static int decimalToBinary(int n){
        int sum = 0, count = 0;
        while(n!=0){
            sum += (n%2 * (int)Math.pow(10,count));
            count++;
            n = n/2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number:");
        int n = sc.nextInt();
        int res = decimalToBinary(n);
        System.out.println(res);
        sc.close();
    }
}
