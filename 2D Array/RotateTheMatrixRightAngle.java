// Rotate RightAngle means Rotate 90 degree
// 90 degree rotation = transpose then reverse 

public class RotateTheMatrixRightAngle{
    public static void main (String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] tranArray = new int[array[0].length][array.length];

        // transpose
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                tranArray[j][i] = array[i][j];
            }
        }

        // reverse
        for(int i = 0 ; i < tranArray.length ; i++){
            int a = 0 ;
            for(int j = tranArray[0].length - 1 ; j >= 0 ; j--){
                array[i][a] = tranArray[i][j];
                a++;
            }
        }

        // print 
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}