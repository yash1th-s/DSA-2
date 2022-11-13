public class SolveMaze {

    public static boolean isSafe(int maze[][], int x, int y){
        return(x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y] == 1);
    }

    public static boolean solveMaze(int maze[][], int x, int y, int sol[][]){
        if(x==maze.length-1 && y==maze.length-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }

        if(isSafe(maze, x, y)){
            sol[x][y] = 1;
            if(solveMaze(maze, x+1, y, sol))
                return true;
            if(solveMaze(maze, x, y+1, sol))
                return true;
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void printSol(int sol[][]){
        for(int i=0; i<sol.length;i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}};

        int sol[][] = new int[maze.length][maze.length];
        if(solveMaze(maze, 0, 0, sol)){
            System.out.println("Solution exists");
            printSol(sol);
        }else{
            System.out.println("Solution doesn't exists");
        }
    }
    
}
