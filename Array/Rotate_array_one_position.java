public class Rotate_array_one_position{
    public static void main (String[] args){

        int[] array = {1,2,5,4,8,7,9,11,55};
        int array_len = array.length;


        for(int i = 0 ; i < array_len - 1 ; i = i+2){
            

            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }



        for (int i = 0 ; i < array_len ; i++ ){
            System.out.print(array[i]);
            System.out.print(",");
        }
    }
}
// if array have odd element then the last element remain on its place because their is a no element for swap
