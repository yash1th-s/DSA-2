package TwoDArrays;

public class TransposeMatrix {

    public static void findTranspose(int matrix[][]){
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][] = {  {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50},
                            {1, 5, 7, 11}  };
        findTranspose(matrix);
    }
    
}
