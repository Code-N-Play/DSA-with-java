public class FindMinimumSubArraySum{
    public static void main (String[] args){

        int[] array = {4,3,2,1};
        int array_len = array.length;
        int sum = 0 ;
        int minimum = array[0];

        for(int i = 0 ; i < array_len ; i++){
            for(int j = i ; j < array_len ; j++){
                sum = 0 ;
                for(int k = i ; k <= j ; k++){
                    sum = sum + array[k];
                    if (sum < minimum){
                        minimum = sum;
                    }
                }
            } 
        }
        System.out.println ("The Minimum Sum of SubArray is : " + minimum);
    }
}