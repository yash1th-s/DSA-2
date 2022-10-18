package Strings;

public class StringCompression {

    public static StringBuilder compressString(String str){
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++; i++;
            }
            res.append(str.charAt(i));
            if(count!=1) 
                res.append(Integer.toString(count));
            
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abbcccdddd";
        System.out.println(compressString(str));
    }
    
}
