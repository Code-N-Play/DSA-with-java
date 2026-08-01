public class MoveAllZeroToBeginning{
    public static void main(String[] args){

        int[] array = {0,1,2,3,4,5,6,7,8,9,0};
        int array_len = array.length;
        int[] new_array = new int[array_len];
        int a = 0;

        for(int i = 0 ; i < array_len ; i++){
            if( array[i] == 0 ){
                new_array[a] = array[i];
                a = a+1;
            }
        }
        for(int i = 0 ; i < array_len ; i++){
            if (array[i] != 0){
                new_array[a] = array[i];
                a = a+1;
            }
        }  
        System.out.println("After moving all zeros to beginning");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(new_array[i] + ", ");
        } 
    }
}