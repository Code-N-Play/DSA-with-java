public class ArrangeAlternatingEvenOddNum{
    public static void main (String[] args){

        int[] array = {1,2,5,4,8,6,3,7,9,0};
        int array_len = array.length;
        int[] new_array = new int[array_len];
        int a = 0 ;
        int b = 1 ; 

        for(int i = 0 ; i < array_len ; i++ ){
            if (array[i] % 2 == 0){
                new_array[a] = array[i];
                a = a + 2 ;
            }
            else{
                new_array[b] = array[i];
                b = b + 2;
            }
        }

        System.out.println("After Rearranging Everyb Element ");

        for(int i = 0 ; i < array_len ; i++ ){
            System.out.print(new_array[i] + ", ");
        }
    }
}