public class FindMAximumSubArraySum{
    public static void main (String[] args){

        int[] array = {1,2,3,4,5,6};
        int array_len = array.length;
        int sum = 0 ; 
        int maximum = 0 ; 

        for(int i = 0 ; i < array_len ; i++){
            for(int j = i ; j < array_len ; j++){
                sum = 0 ;
                for(int k = i ; k <= j ; k++){
                    sum = sum + array[k];
                    if (sum > maximum){
                        maximum = sum ;
                    } 
                } 
            }
        }
        System.out.println("The Maximum sum of SubArray is : " + maximum);
    }
}