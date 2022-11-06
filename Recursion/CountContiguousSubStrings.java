package Recursion;

public class CountContiguousSubStrings {
    static String arr[] = new String[100];
    static int count = 0;

    public static void countSubstrings(String str, int i){
        if(i == str.length()){
            return;
        }
        for(int j=i;j<str.length();j++){
            if(str.charAt(i) == str.charAt(j)){
                count++;
            }
        }
        countSubstrings(str, i+1);

    }

    public static void main(String[] args) {
        countSubstrings("aba", 0);
        System.out.println(count);
        
    }
    
}
