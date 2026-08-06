public class SortAllOddElement {
    public static void main (String[] args){

        int[] array = {5,2,7,1,15,9,6,19,13};
        int array_len = array.length;
        int temp = 0 ;
        int count = 0 ; 

        for(int i = 0 ; i < array_len ; i++){
            if (array[i] % 2 != 0 ){
                count = count+1;
            }
        }
        int[] odd_ele_array = new int[count];
        int a = 0 ; 
        for(int i = 0 ; i < array_len ; i++){
            if (array[i] % 2 != 0 ){
                odd_ele_array[a] = array[i];
                a = a + 1 ;
            }
        }
        for(int i = 0 ; i < count ; i++){
            for(int j = 0 ; j < count -1  ; j++){
                if (odd_ele_array [j] > odd_ele_array [j+1]){
                    temp = odd_ele_array[j];
                    odd_ele_array[j] = odd_ele_array[j+1];
                    odd_ele_array[j+1] = temp ;
                }
            }
        }
        int b = 0 ;
        for(int i = 0 ; i < array_len ; i++){
            if (array[i] % 2 != 0 ){
                array[i] = odd_ele_array [b];
                b = b + 1 ;
            }
        }

        System.out.println("Only Odd elememt Sorted array : ");
        for(int  i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", "); 
        }
    }
}