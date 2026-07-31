public class SwapFirstToLast{
    public static void main (String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9};
        int array_len = array.length;
        int temp = 0 ; 

        temp = array[0];
        array[0] = array[array_len-1];
        array[array_len-1] = temp ;

        System.out.println("First and Last Element Swaped  ");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");

        }
    }
}