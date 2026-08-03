public class FindLargestEvenAndOddNum{
    public static void main (String[] args){

        int[] array = {15,1,2,10,3,11,4,5,6,7,8,9};
        int array_len = array.length;
        int max_even_ele = 0 ; 
        int max_odd_ele = 0 ; 

        for(int i = 0 ; i < array_len ; i++){
            int ele = array[i];

            if(ele % 2 == 0 && ele > max_even_ele){
                max_even_ele = ele ;
            }
            else if (ele % 2 != 0 && ele > max_odd_ele){
                max_odd_ele = ele ;
            }
            
        }
        System.out.println(max_even_ele + " is the Largest Even Number in Array");
        System.out.println(max_odd_ele + " is the Largest Odd Number in Array");
    }
}