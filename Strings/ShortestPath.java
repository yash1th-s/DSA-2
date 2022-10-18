package Strings;

public class ShortestPath {

    public static double getShortestPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length();i++){
            if(path.charAt(i)=='N')
                y++;
            if(path.charAt(i)=='S')
                y--;
            if(path.charAt(i)=='E')
                x++;
            if(path.charAt(i)=='W')
                x--;
        }
        double displacement = Math.sqrt((x*x)+(y*y));
        return displacement;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
    
}
