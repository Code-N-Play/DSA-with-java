public class SumOfEverySubArray{
    public static void main (String[] args){

        int[] array = {1,2,3};
        int array_len = array.length;
        int sum = 0 ;

        for(int i = 0 ; i < array_len ; i++){
            for(int j = i ; j < array_len ; j++){
                sum = 0 ;
                for(int k = i ; k <= j ; k++){
                    sum = sum + array[k] ;
                }
                System.out.println("Sum of SubArray : " + sum);
            }
            System.out.println("");
        }
    }
}