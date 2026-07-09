public class reverse_array{
    public static void main (String [] args){

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int array_len = array.length;

        for(int i = array_len-1 ; i >= 0  ; i--){
            int element = array[i];

            System.out.print(element + " ");
        }
    }
}