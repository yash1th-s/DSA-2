package TwoDArrays;

public class SpiralMatrix {

    public static void printSpiral(int matrix[][]){
        int minRow = 0, minCol = 0, maxRow = matrix.length-1, maxCol = matrix[0].length-1;
        while(minRow<= maxRow && minCol<=maxCol){
            for(int i=minCol; i<=maxCol; i++){
                System.out.print(matrix[minRow][i]+" ");
            }
            minRow++;
            for(int i=minRow; i<=maxRow; i++){
                System.out.print(matrix[i][maxCol]+" ");
            }
            maxCol--;
            for(int i=maxCol; i>=minCol; i--){
                System.out.print(matrix[maxRow][i]+" ");
            }
            maxRow--;
            for(int i=maxRow; i>=minRow; i--){
                System.out.print(matrix[i][minCol]+" ");
            }
            minCol++;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {  {1, 2, 3, 4,},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}    };
        printSpiral(matrix);
    }
    
}
