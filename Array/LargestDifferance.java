public class LargestDifferance{
    public static void main (String [ ] args){
        
        int[] array = {111,2,3,45,6,7,8};
        int array_len = array.length;
        int temp = 0 ;
        for(int j = 0 ; j < array_len ; j++){
            for (int i = 0 ; i < array_len -1 ; i++){
                if (array[i] > array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    
                }
            }

        }

        int largest_Differance = array[array_len-1] - array[0];

        System.out.println("Largest Differance in Array is : " + largest_Differance); 

    }
}