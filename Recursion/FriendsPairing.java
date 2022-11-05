package Recursion;

public class FriendsPairing {

    public static int totalPairingWays(int n){

        if(n==1 || n==2){
            return n;
        }

        int single = totalPairingWays(n-1);

        int pair = (n-1)*totalPairingWays(n-2);

        int total = single + pair;

        return total;
    }

    public static void main(String[] args) {

        System.out.println(totalPairingWays(3));
        
    }
    
}
