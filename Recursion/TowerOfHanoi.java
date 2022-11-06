package Recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String hlp, String dst){
        if(n==1){
            System.out.println("Move disk "+n+" from "+src+" to "+dst);
            return;
        }
        towerOfHanoi(n-1, src, dst, hlp);
        System.out.println("Move disk "+n+" from "+src+" to "+dst);
        towerOfHanoi(n-1, hlp, src, dst);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, "A", "B", "C");
    }
    
}
