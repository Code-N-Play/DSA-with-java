public class OneDArrayOfColumnSumOfTwoDArray{
    public static void main (String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[] new_array = new int[array[0].length];
        int sum = 0 ; 

        for(int j = 0 ; j < array[0].length ; j++){
            sum = 0 ;
            for(int i = 0 ; i < array.length ; i++){
                sum = sum + array[i][j];
            }
            new_array[j] = sum ;
        }

        for(int i = 0 ; i < array[0].length ; i++){
            System.out.print(new_array[i] + " ");
        }
        
    }
}