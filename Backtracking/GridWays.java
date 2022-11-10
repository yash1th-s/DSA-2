public class GridWays {

    public static int totalWays(int m, int n, int i, int j){
        
        if(i==m-1 && j==n-1){
            return 1;
        }
        else if(i>=m || j>=n){
            return 0;
        }

        int downwards = totalWays(m, n, i+1, j);
        int rightwards = totalWays(m, n, i, j+1);

        return downwards+rightwards;
    }

    public static void main(String[] args) {
        System.out.println(totalWays(3, 3, 0, 0));
    }
    
}
