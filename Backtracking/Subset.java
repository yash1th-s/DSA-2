package Backtracking;

public class Subset {

    public static void findSubsets(String str, int i, String newStr){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        findSubsets(str, i+1, newStr+str.charAt(i));
        findSubsets(str, i+1, newStr);
    }

    public static void main(String[] args) {
        findSubsets("abc", 0, "");
    }
    
}
