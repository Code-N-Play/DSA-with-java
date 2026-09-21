public class ReverseTheRow{
    public static void main (String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] new_array = new int[array.length][array[0].length];

        for(int i = 0 ; i < array.length ; i++){
            int a = 0;
            for(int j = array[0].length-1 ; j >= 0 ; j--){
                new_array[i][a] = array[i][j];
                a++;
            }
        }
        //print
        for(int i = 0 ; i < array.length ; i++){
            for(int j= 0 ; j < array[0].length ; j++){
                System.out.printi(new_array[i][j] + " ");
            }
            System.out.println();
        }
    }
}