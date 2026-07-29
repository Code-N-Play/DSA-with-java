public class FindMinimumFrequencyEle{
    public static void main (String[] args){

        int[] array = {1,1,1,1,3,3,5,3,5,5,4,4,4};
        int array_len = array.length;
        int count = 0 ; 
        int temp = array_len ;
        int minimum_ele = 0 ; 

        for(int i = 0 ; i < array_len ; i++){
            int ele = array[i];
            count = 0 ;
            for(int j = 0 ; j < array_len ; j++){
                if (ele == array[j]){
                    count = count + 1;
                }
            }
            if(count < temp ){
                temp = count ; 
                minimum_ele = ele ;
            }
        }

        System.out.println(minimum_ele + " Have Minimum Frequency : "  + temp);
    }
}