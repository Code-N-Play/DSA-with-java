public class FindElementThatAppearsThreeTime{
    public static void main (String[] args){

        int[] array = {1,5,2,5,4,8,5,1,4,5,1,4};
        int array_len = array.length;
        int n = 0 ; 
        String output = "" ;

        for(int i = 0 ; i < array_len ; i++){
            int ele = array[i];
            n = 0 ;
            for(int j = 0 ; j <array_len ; j++){
                if (ele == array[j]){
                    n = n + 1 ;
                }
            }
            String ele_str = String.valueOf(ele);
            if ( n == 3 && !output.contains(ele_str)){
                output = output + ele  + ", " ;
            }
        }
        int output_len = output.length();
        
        if(output_len != 0){
            System.out.println("Element That Appears Three Time in Array : " + output);
        }
        else{
            System.out.println("NO Element Appears Three Time in Array ");
        }
    }
}