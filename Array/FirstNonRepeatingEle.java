public class FirstNonRepeatingEle{
    public static void main (String[] args){

        int[] array = {1,1,1,1,3,3,3,5,4,4};
        int array_len = array.length;
        int count = 0 ; 

        for(int i = 0 ; i < array_len ; i++){
            int ele = array[i];
            count = 0 ;
            for(int j = 0 ; j < array_len ; j++){
                if (ele == array[j]){
                    count = count + 1;
                }
            }
            if(count == 1 ){
                System.out.println(ele + " is the first non-Repeating element ");
                return ;
            }
            
        }
        System.out.println("Array don't have any non repeating element");
    }
}