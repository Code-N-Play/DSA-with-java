import java.util.Arrays;

public class CheckArrayIsRotationOfanother{
    public static void main (String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9};
        int array_len = array.length;
        int[] given_array = {9,1,2,3,4,5,6,7,8};
        int temp = 0 ; 
        boolean issame = false ;

        for(int i = 0 ; i < array_len ; i++){
            for(int j = 0 ; j < array_len-1 ; j++){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
            if(Arrays.equals(array,given_array)){ // Arrays.equals(arr1,arr2)   is line ka use do array equale hai ki nahi isko check krne ke liye kiya jata hai 
                issame = true ;
                break;
            }
        }

        if(issame){
            System.out.println("Given Array is a rotation of main Array");
        }
        else{
            System.out.println("Given Array is NOT a rotation of main Array");
        }
    }
}