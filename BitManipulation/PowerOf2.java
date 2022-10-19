package BitManipulation;

public class PowerOf2 {

    public static void isPowerOf2(int n){
        if((n&(n-1))==0) 
            System.out.println("The number "+n+" is power of 2");
        else   
            System.out.println("The number "+n+" is NOT the power of 2");
    }

    public static void main(String[] args) {
        int n = 1024;
        isPowerOf2(n);
    }
    
}
