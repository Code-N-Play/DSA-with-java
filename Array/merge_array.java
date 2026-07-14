public class merge_array{
    public static void main(String[] args){

        int[] array1 = {1,2,3,4,5,6,7,8,9,0};
        int[] array2 = {0,9,8,7,6,5,4,3,2,1};

        int array1_len = array1.length; // finding first array length
        int array2_len = array2.length; // finding second array length

        int new_array_len = array1_len + array2_len; // length addition

        int[] new_array = new int[new_array_len]; // creating new array with length of combination on array 1 and array 2

        for (int i = 0 ; i < array1_len ; i++){
            new_array[i] = array1[i]; // store array 1 element to new array 
        }

        for (int i = 0 ; i < array2_len ; i++){
            new_array[array1_len + i] = array2[i]; // store array 2 element to new array (which contains array1 elements) 
        }

        for( int i = 0 ; i < new_array_len ; i++ ){
            System.out.print(new_array[i]); // print new array element 
            System.out.print(","); // seperate array element by comma
        }
    }
}