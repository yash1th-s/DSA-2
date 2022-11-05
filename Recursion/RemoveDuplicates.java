package Recursion;

public class RemoveDuplicates {

    static int character[] = new int[26];

    public static void removeDuplicate(String str, int i, StringBuilder newStr){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char x = str.charAt(i);
        if(character[x-'a'] == 0){
            character[x-'a'] = 1;
            removeDuplicate(str, i+1, newStr.append(x));
        }
        else{
            removeDuplicate(str, i+1, newStr);
        }
    }

    public static void main(String[] args) {
        removeDuplicate("yashwanth", 0, new StringBuilder(""));
    }
    
}
