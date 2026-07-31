public class ReverseHalfArray{
    public static void main (String[] args){

        int[] array = {0,1,2,3,4,5,6,7,8,9,};
        int array_len = array.length;
        int first_half = Math.round(array_len / 2);

// Reverse only First Half....................................

        int[] new_array = new int[array_len];
        int k = 0 ;

        for(int i = first_half -1 ; i >= 0 ; i--){
            new_array[k] = array[i];
            k = k+1 ;
        }

        for(int j = first_half ; j < array_len ; j++ ){
            new_array [j] = array[j];
        }
        System.out.println("First Half Reverse Array ");
        for(int l = 0 ; l < array_len ; l++){
            System.out.print(new_array[l] + ", ");
        }
        System.out.println("");



// Reverse only second Half ..........................................

        int[] second_half_array = new int[array_len];
        int a = 0 ;

        for(int j = 0 ; j < first_half ;j++){
            second_half_array[j] = array[j];
        }

        for (int i = array_len - 1 ; i >= first_half ; i-- ){
            second_half_array[first_half + a] = array [i];
            a = a + 1;
        }

        System.out.println("Second half Reverse Array ");
        for(int l  = 0 ; l < array_len ; l++){
            System.out.print(second_half_array[l] + ", ");
        }
    }
}