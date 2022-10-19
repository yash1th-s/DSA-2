package BitManipulation;

public class OddEven {

    public static void isEven(long n){
        if((n&1) == 0)
            System.out.println("Even");
        else 
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        long n = 1921222222;
        isEven(n);
    }
    
}
