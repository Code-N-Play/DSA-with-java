public class TransposeTheMatrix{
    public static void main (String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] new_array = new int[array[0].length][array.length];

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                new_array[j][i] = array[i][j];
            }
        }

        // print 
        for(int i = 0 ; i < array[0].length ; i++){
            for(int j = 0 ; j < array.length ; j++){
                System.out.print(new_array[i][j] + " ");
            }
            System.out.println();
        }
    }
}