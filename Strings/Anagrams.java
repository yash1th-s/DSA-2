package Strings;
import java.util.*;;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "carei";
        String str2 = "racel";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char s1[] = str1.toCharArray();
        char s2[] = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1, s2)){
            System.out.println("The two strings are anagrams of each other");
        }
        else{
            System.out.println("The two strings are NOT anagrams of each other");
        }
    }
    
}
