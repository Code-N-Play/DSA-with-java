// both 2D array have same order
public class SumOfTwoMatrix{
    public static void main (String[] args){

        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{9,8,7},{6,5,4},{3,2,1}};
        int[][] sumMatrix = new int[array1.length][array1[0].length];

        for(int i = 0 ; i < array1.length ; i++){
            for(int j = 0 ; j < array1[0].length ; j++){
                sumMatrix[i][j] = array1[i][j] + array2[i][j] ; 
            }
        }

        // print sumMatrix
        for(int i = 0 ; i < array1.length ; i++){
            for(int j = 0 ; j < array1[0].length ; j++){
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}