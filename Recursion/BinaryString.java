package Recursion;

public class BinaryString {

    //no consecutive 1s
    public static void binaryString(int n,int i, StringBuilder newStr){

        if(i == n){
            System.out.println(newStr);
            return;
        }

        binaryString(n, i+1, newStr.append('0'));
            newStr.deleteCharAt(i);

        if(newStr.length() == 0 || newStr.charAt(i-1) == '0'){
            binaryString(n, i+1, newStr.append('1'));
            newStr.deleteCharAt(i);
        }

    }

    public static void main(String[] args) {
        binaryString(3, 0, new StringBuilder(""));
    }
    
}
