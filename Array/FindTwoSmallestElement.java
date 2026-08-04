public class FindTwoSmallestElement{
    public static void main (String[] args){

        int[] array = {1,2,3,54,56,6,-100000000,8,7,8,4,0};
        int array_len = array.length;
        int min_ele = array[0]; 
        String output = "";

       for(int j = 0 ; j < 2 ; j++){
            for(int i = 0 ; i < array_len ; i++){
                int ele = array[i];
                if (ele < min_ele){
                    min_ele = ele ; 
                }
            }
            output = output + min_ele + ", ";
            for(int i = 0 ; i < array_len ; i++){
                if (array[i] == min_ele){
                    array[i] = 10000000;
                }
            }
            min_ele = array[0];
        }
        System.out.println(output + " is the Two Smallest Element in Array");
    }
}