public class SortAscending{
    public static void main (String[] args){

        int[] array = {9,8,4,6,7,9,5};
        int array_len = array.length;
        int temp = 0;
        for(int j = 0 ; j < array_len ; j++){
            for(int i = 0 ; i < array_len - 1 ; i++){
            if (array[i] > array[i+1]){
                temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp ; 
            }
        }
        }
        System.out.print("Final Sorted Array : ");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println(" ");
    }
}