public class SortingAlgo__BubbleSort{
    public static void main (String[] args){

        int[] array = {1,5,46,458,47,11,56,2,3,85,7,12,5,3,45,7,8,4,89,45,9,4,5};
        int array_len = array.length;
        int temp = 0 ;
        int phases = array_len-1;

        for(int j = 0 ; j <= phases ; j++){
            for(int i = 0 ; i < array_len-1 ; i++){
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp ;
                }
            }
        }

        System.out.println("Bubble Sorted Array is :");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}