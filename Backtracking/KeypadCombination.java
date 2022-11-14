public class KeypadCombination {

    final static char [][] key = {{},{},{ 'a' , 'b' , 'c' },{ 'd' , 'e' , 'f' },{ 'g' , 'h' , 'i' }, { 'j' , 'k' , 'l' },{ 'm' , 'n' , 'o' },{ 'p' , 'q' , 'r' , 's' }, { 't' , 'u' , 'v' },{ 'w' , 'x' , 'y' , 'z' }};

    public static void keyCombi(String digits,int i, String ans){
        if(i==digits.length()){
            System.out.println(ans);
            return;
        }
        char c = digits.charAt(i);
        for(int j=0;j<key[c-'0'].length;j++){
            keyCombi(digits, i+1, ans+key[c-'0'][j]);
        }
    }

    public static void main(String[] args) {
        String digits = "2";
        keyCombi(digits, 0, "");
    }
    
}
