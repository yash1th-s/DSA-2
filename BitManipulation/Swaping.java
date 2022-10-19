package BitManipulation;

public class Swaping {

    public static void swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b);
    }
    
}
