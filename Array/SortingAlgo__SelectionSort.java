public class SortingAlgo__SelectionSort{
    public static void main (String[] args){

        int[] array = {1,5,46,458,47,11,56,2,3,85,7,12,5,3,45,7,8,4,89,45,9,4,5,0};
        int array_len = array.length;
        

        for(int i = 0 ; i < array_len-1 ; i++){
            int min_index = i;
            for(int j = i+1 ; j < array_len ; j++){
                if (array[j] < array[min_index]){
                    min_index = j;
                }
            }
            int temp = array[i] ;
            array[i] = array[min_index] ;
            array[min_index] = temp; 
        }

        System.out.println("Selection Sorted Array :");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i]+", ");
        }
    }
}