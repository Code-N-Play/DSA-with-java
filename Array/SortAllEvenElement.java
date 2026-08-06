public class SortAllEvenElement{
    public static void main (String[] args){

        int[] array = {4,8,2,5,6,3,9,8,4,10};
        int array_len = array.length;
        int temp = 0 ;
        int count = 0 ;

        for(int i = 0 ; i < array_len ; i++){
            if(array[i] %2 == 0 ){
                count = count + 1 ;
            }
        }
        int[] even_ele_array = new int[count];
        int a = 0;
        for(int i = 0 ; i < array_len ; i++){
            if (array[i] %2 == 0 ){
                even_ele_array[a] = array[i];
                a = a + 1;
            }
        }
        for(int i = 0 ; i < count ; i++){
            for(int j = 0 ; j < count - 1 ; j++){
                if (even_ele_array[j] > even_ele_array [j+1]){
                    temp = even_ele_array[j];
                    even_ele_array[j] = even_ele_array [j+1];
                    even_ele_array[j+1] = temp ;
                }
            }
        }
        int b = 0 ;
        for(int i = 0 ; i < array_len ; i++){
            if (array[i] % 2 == 0){
                array[i] = even_ele_array[b];
                b = b +1; 
            }
        }
        
        System.out.println("Even Element sorted :");
        for(int  i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}

// approch :- 

// first count even element in array 
// make a new array whose size is qual to even element count 
// in new array add the all even element 
// sort even element in accending order 
// in main array where you get even element then add even element from new array
// print even sorted array 