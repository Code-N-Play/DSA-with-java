public class SortOnlyPositiveEle{
    public static void main (String[] args){

        int[]  array = {0,20,1,-5,-46,8,3,4,7,9,0,2,-20,-1,-2};
        int array_len = array.length ; 
        int temp = 0 ; 
        int count = 0 ;

        for(int i = 0 ; i < array_len ; i++){
            if(array[i] >= 0 ){
                count = count + 1;
            }
        }
        int[] positive_ele_array = new int[count];
        int a = 0 ; 
        for(int i = 0 ; i < array_len ; i++){
            if (array[i] >= 0 ){
                positive_ele_array[a] = array[i];
                a = a+1;
            }
        }
        for(int i = 0 ; i < count ; i++){
            for(int j = 0 ; j < count -1 ; j++){
                if(positive_ele_array[j] > positive_ele_array[j+1]){
                    temp = positive_ele_array[j];
                    positive_ele_array[j] = positive_ele_array[j+1];
                    positive_ele_array[j+1] = temp ;
                }
            }
        }
        int b=0;
        for(int i = 0 ; i < array_len ; i++){
            if (array[i] >= 0 ){
                array[i] = positive_ele_array[b];
                b=b+1;
            }
        }

        System.out.println("Positive Element Sorted array :");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}