public class Count_odd_even{
    public static void main(String[] args){
        int[] array = {1,2,5,4,5,8,4,55,4,10,15,3,33};
        int array_len = array.length;

        int odd_count = 0;
        int even_count = 0;

        for (int i = 0 ; i < array_len ; i++){
            int element = array[i];

            if (element % 2 == 0){
                even_count = even_count + 1;
            }

            else {
                odd_count = odd_count + 1;
            }
        }

        System.out.println("The odd numbers in array is " + odd_count );
        System.out.println("The even numbers in array is " + even_count);
    }
}