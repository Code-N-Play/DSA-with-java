public class SortOnlyNegativeEle{
    public static void main (String[] args){

        int[] array = {0,20,1,-5,-46,8,3,4,7,9,0,2,-20,-1,-2};
        int array_len = array.length;
        int count = 0 ;
        int temp = 0 ;

        for(int i = 0 ; i < array_len ; i++){
            if (array[i] < 0){
                count = count + 1 ;
            }
        }

        int[] negative_ele_array = new int[count];
        int a = 0 ;
        for(int i = 0 ; i < array_len ; i++){
            if (array[i] < 0){
                negative_ele_array[a] = array[i];
                a=a+1;
            }
        }
        for(int i = 0 ; i < count ; i++){
            for(int j = 0 ; j < count-1 ; j++){
                if (negative_ele_array[j] < negative_ele_array[j+1]){
                    temp = negative_ele_array[j];
                    negative_ele_array[j] = negative_ele_array[j+1];
                    negative_ele_array[j+1] = temp ;
                }
            }
        }
        int b =0;
        for(int i = 0 ; i < array_len ; i++){
            if(array[i] < 0){
                array[i] = negative_ele_array[b];
                b=b+1;
            }
        }
        System.out.println("Negative Element Sorted Array :");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}