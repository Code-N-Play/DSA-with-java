public class SubArray {
    public static void main (String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9};
        int array_len = array.length;
        String SubArray = "";

        for(int k = 0 ; k < array_len ; k++){
            for(int i = k ; i < array_len ; i++){
                SubArray = " ";
                for(int j = k ; j <= i  ; j++){
                    SubArray = SubArray +  "" + array[j] + ", " ;
                
                }
                System.out.println(SubArray);
            }
        
            System.out.println(" ");
        }

        
    }
}

// this is a printing of sub array elements if you want to create array then first find the number of sub array and then make it in every iteration 