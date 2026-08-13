public class CountTotalSubArray{
    public static void main (String[] args){

        int[] array = {1,2,3,4,5};
        int array_len = array.length;
        int count = 0 ; 

        for(int i = 0 ; i < array_len ; i++){
            for(int j = i ; j < array_len ; j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(array[k] + ", ");
                    
                }
                System.out.println("");
                count = count+1;
            }
            System.out.println(" ");
        }
        System.out.println("Total number of SubArray is : " + count);
    }
}