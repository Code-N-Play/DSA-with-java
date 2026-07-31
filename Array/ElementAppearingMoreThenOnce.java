public class ElementAppearingMoreThenOnce{
    public static void main (String[] args){

        int[] array = {1,2,4,5,6,7,8,9,4,1,2,5,6,3};
        int array_len = array.length;
        int count = 0 ;
        String output_str = "" ;
        boolean already = false ;

        for(int i = 0 ; i < array_len ; i++){
            int ele = array[i];
            count = 0 ;
            for(int j = 0 ; j < array_len ; j++){
                int ele2 = array[j];
                if(ele == ele2){
                    count = count + 1 ;
                }
            }
            String ele_str = String.valueOf(ele);

            if (output_str.contains(ele_str)){
                already = true ;
            }

            if (count > 1 && !already ){
                
                output_str =  output_str +" "+ ele_str ;
            }
        }
        System.out.println(output_str + " Elements Appear more then once ");
    }
}