public class Sum_and_average{
    public static void main(String[] args){

        int[] array = {1,45,54,7,18,63};
        int array_len = array.length;

        int sum = 0 ;
        int average ;

        for(int i = 0 ; i < array_len ; i++){
            sum = sum + array[i];
        }

        average = sum / array_len;

        System.out.println("The Sum of array is " + sum);
        System.out.println("The Average of array is " + average);
    }
}