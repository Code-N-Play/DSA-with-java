public class Smalest_ele_in_array{
    public static void main(String [] args){

        int[] array = {10,4,5,8,7,9,13};
        int array_len = array.length;

        int temp = array[0];

        for (int i = 0 ; i < array_len ; i++){
            int element = array[i];

            if (temp > element){
                temp = element ;
            }
        }

        System.out.println("The Smallest element is " + temp);
    }
}