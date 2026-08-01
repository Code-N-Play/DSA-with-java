public class SeparatePositiveAndNegative{
    public static void main(String[] args){

        int[] array = {2,-1,2,3,-4,5,6,-9,8,7,-15,0};
        int array_len = array.length;
        int negative_count = 0 ;
        int a = 0 ;
        int b = 0 ;

        for(int i = 0 ; i < array_len ; i++){
            if (array[i] < 0){
                negative_count = negative_count + 1;
            }
        }
        int positive_count = array_len - negative_count ;

        int[] negative_array = new int[negative_count];
        int[] positive_array = new int[positive_count];

        for(int i = 0 ; i < array_len ; i++){
            if(array[i] < 0){
                negative_array[a] = array[i];
                a = a + 1 ;
            }
            else{
                positive_array[b] = array[i];
                b = b + 1 ; 
            }
        }
        System.out.println("Positive Element Array ");
        for(int i = 0 ; i < positive_count ; i++){
            System.out.print(positive_array[i] + ", ");
        }
        
        System.out.println(" ");

        System.out.println("Negative Element Array ");
        for(int i = 0 ; i < negative_count ; i++){
            System.out.print(negative_array[i] + ", ");
        }
    }
}