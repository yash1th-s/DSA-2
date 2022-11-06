package Recursion;

public class NumberToWords {

    static String nums[] = {"zero", "one","two","three","four","five","six","seven","eight","nine"};

    public static void toWords(int n){
        if(n==0){
            return;
        }
        int x = n%10;
        toWords(n/10);
        System.out.print(nums[x]+" ");
    }

    public static void main(String[] args) {
        toWords(1947);
    }
    
}
