public class FirstRepeatingEle{
    public static void main (String[] args){

        int[] array = {2,1,5,4,32,10,8,79,3,66,66};
        int array_len = array.length;
        int count = 0 ;

        for(int i = 0 ; i < array_len ; i++){
            int ele = array[i];
            count = 0 ;
            for(int j= 0 ; j< array_len ; j++){
                if (ele == array[j]){
                    count = count + 1 ;
                }
            }
            if (count > 1){
                System.out.println(ele + " is the First Repeating element in Array");
                return;
            }
        }
    }
}