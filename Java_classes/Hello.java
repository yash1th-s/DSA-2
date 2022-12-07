package Java_classes;
import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=5; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    
}