public class FindElementThatOccureMin{
    public static void main (String[] args){

        int[] array = {1,2,4,5,7,7,8,9,6,3,2,1,4,5,8,3};
        int array_len = array.length;
        int n = 0 ;
        int min = array_len ;
        int minimumAppear_ele = 0 ;

        for(int  i = 0 ; i <array_len ; i++){
            int ele = array[i] ;
            n = 0 ;
            for(int j = 0 ; j < array_len ; j++){
                if(ele == array[j]){
                    n = n + 1;
                }
            }
            if(n < min){
                min = n ;
                minimumAppear_ele = ele ;
            }
        }

        System.out.println("Element " + minimumAppear_ele + " Occure Minimum Time in Array");
    }
}