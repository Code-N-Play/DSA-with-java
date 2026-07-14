public class Rotate_array_one_position{
    public static void main (String[] args){

        int[] array = {1,2,5,4,8,7};
        int array_len = array.length;

        int temp = 0;

        for(int i = 0 ; i < array_len ; i = i+2){
            int element = array[i];
            int element2 = array[i+1];

            temp = element2;
            element2 = element;
            element = temp;
        }

        System.out.println(array);

        for (int i = 0 ; i < array_len ; i++ ){
            System.out.print(array[i]);
            System.out.print(",");
        }
    }
}