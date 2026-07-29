public class FindMaximumFrequencyEle{
    public static void main (String[] args){

        int[] array = {1,1,2,4,5,7,8,1,2,2,4,5,8,4,84,4};
        int array_len = array.length;
        int maximum = 0 ; 
        int count = 0 ;
        int temp_ele = 0 ;
        int ele = 0;

        for(int i = 0 ; i < array_len ; i++){
            temp_ele = array[i]; 
            count = 0; 
            for(int j = 0 ; j < array_len ; j++){
                if(temp_ele == array[j]){
                    count = count + 1;
                }

            }
            if(count >= maximum){
                maximum = count ;
                ele = temp_ele ;

            }

        }

        System.out.println(ele + " have Maximum Frequency : " + maximum);
    }
}