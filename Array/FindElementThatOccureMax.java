public class FindElementThatOccureMax{
    public static void main (String[] args){
        
        int[] array = {2,5,3,4,5,1,8,7,98,4,4,5,1,5,1,1,5,8,3};
        int array_len = array.length;
        int n = 0 ;
        int max = 0 ;
        int maxAppear_ele = 0 ; 


        for(int i = 0 ; i < array_len ; i++){
            int ele = array [i];
            n = 0 ;
            for(int j= 0 ; j< array_len ; j++){
                if (ele == array[j]){
                    n = n + 1 ;
                }
            }
            if (n > max) {
                max = n ;
                maxAppear_ele = ele ;
            }
        }
        System.out.println(  "Element " + maxAppear_ele + " Occure maximum Time in Array ");
    }
}