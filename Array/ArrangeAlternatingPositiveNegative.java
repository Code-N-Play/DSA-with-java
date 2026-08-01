public class ArrangeAlternatingPositiveNegative{
    public static void main (String[] args){

        int[] array = {-3,-5,-1,2,3,-4,5,6,-9,8,7,-15,0,-1,}; // it is most important to take equal numeber of positive num and negative num to perform this operation 
        int array_len = array.length;
        int[] new_array = new int[array_len];
        int a = 0 ;
        int b = 1 ;

        for(int  i = 0 ; i < array_len ; i++){
            if (array[i] >= 0 ){
                new_array[a] = array[i];
                a = a+2;
            }
            else{
                new_array[b] = array[i];
                b = b+2;
            }
        }
        System.out.println("After Rearranging Every element");

        for(int i = 0 ; i < array_len ; i++){
            System.out.print(new_array[i] + ", ");
        }
    }
}