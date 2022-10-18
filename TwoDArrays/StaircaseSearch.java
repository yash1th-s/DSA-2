package TwoDArrays;

//Search in a sorted matrix
public class StaircaseSearch {

    public static void staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at position ("+row+","+col+")");
                return ;
            }
            else if(key > matrix[row][col])
                row++;
            else 
                col--;
        }
        System.out.println("Key not found!");
        return;
        }
    

    public static void main(String[] args) {
        int matrix[][] = {  {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}    };
        int key = 3;
        staircaseSearch(matrix, key);
    }
}
