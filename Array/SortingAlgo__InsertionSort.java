public class SortingAlgo__InsertionSort{
    public static void main (String[] args){

        int[] array = {5,4,8,7,9,6,2,1,3};
        int array_len = array.length;
        int temp = 0 ;

        for(int i = 0 ; i < array_len -1 ; i++){
            if(array[i] > array[i+1]){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp ;

                int j = i ;
                while(j > 0 && array[j] < array[j-1] ){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;

                    j = j - 1 ;
                }
            }
        }
        System.out.println("Insertion Sorted Array : ");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}