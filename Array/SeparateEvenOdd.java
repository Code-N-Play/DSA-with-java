public class SeparateEvenOdd{
    public static void main (String[ ] args) {

        int[] array  = {1,2,3,4,5,6,7,8,9};
        int array_len = array.length;
        int odd = 0 ;
        int even = 0 ;

        for(int i = 0 ; i < array_len ; i++){
            if (array[i] % 2 == 0){
                even = even + 1 ;
            }
            else{
                odd = odd + 1;
            }
        }

        int[] odd_array = new int[odd];  
        int[] even_array = new int[even]; 
        int index1 = 0 ; // alag alag array mai value dalte samay mai main array ke index ka use nahi kr sakta kuki mere sub array ki length main array se choti hai 
        int index2 = 0 ;

        for(int j = 0 ; j < array_len ; j++ ){
            if (array[j] % 2 == 0  ){
                even_array[index1] = array[j]; // index1 mai pahli bar mai 0 hoga then 1 incriment ho jaega value put krne ke bad
                index1 = index1 + 1 ;  // value incriment 
            }
            else{
                odd_array[index2] = array[j];
                index2 = index2 + 1;
            }
        }
        System.out.print("Even Element Array :  ");
        for(int k = 0 ; k < even ; k++){
            System.out.print(even_array[k] + ", ");
        }
        System.out.println("");
        System.out.print("Odd Element Array :  ");
        for(int l = 0 ; l < odd ; l++){
            System.out.print(odd_array[l] + ", ");
        }
        System.out.println("");
    }
}