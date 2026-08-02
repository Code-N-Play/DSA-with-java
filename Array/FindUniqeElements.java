public class FindUniqeElements{
    public static void main (String[] args){

        int[] array = {1,2,4,1,25,3,1,54,2,15,6};
        int array_len = array.length;
        int n = 0;
        String output = "";

        for(int i = 0 ; i < array_len ; i ++){
            int ele = array[i];
            n = 0 ;
            for(int j = 0 ; j < array_len ; j++){
                if(ele == array[j]){
                    n = n + 1 ;                    
                }
            }
            String ele_str = String.valueOf(ele);

            if(n >= 1 && !output.contains(ele_str)){
                output = output + ele_str + " ";
            }
        }
        
        System.out.println("All Uniqe Elements are : " + output);
    }
}