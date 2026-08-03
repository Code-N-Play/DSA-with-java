public class FindTwoLargestElement{
    public static void main (String[] args){

        int[] array = {90,1,2,3,45,56,87,89,52,4,99};
        int array_len = array.length;
        int max = 0 ; 
        String output = "";

       for (int k = 0 ; k < 2 ; k++){
           
            for(int i = 0 ; i < array_len ; i++){
                int ele = array[i];
                if (ele > max ){
                    max = ele ;
                }
            }
            output = output + max + ", "; 
            for(int i = 0 ; i < array_len ; i++){
                if (array[i] == max){
                    array[i] = 0 ;
                }
            }
            max = 0 ;
        }
        System.out.println( "Two Largest Elements are " + output);
    }
}