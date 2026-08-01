public class MoveNegativeNumToBeginning{
    public static void main (String[] args){

        int[] array = {-1,2,3,-4,5,6,-9,8,7,-15,0};
        int array_len = array.length;
        int[] new_array = new int[array_len];
        int a = 0 ;

        for(int i = 0 ; i < array_len ; i++){
            if (array[i] < 0){
                new_array[a] = array[i];
                a = a + 1;
            }
        }
        for(int i = 0 ; i < array_len ; i++){
            if (array[i] >= 0 ){
                new_array[a] = array[i];
                a = a+1;
            }
        }
        System.out.println("After Moving All Negative Numbers to the Beginning");
        for(int i =0 ; i < array_len ; i++){
            System.out.print(new_array[i] + ", ");
        }
    }
}