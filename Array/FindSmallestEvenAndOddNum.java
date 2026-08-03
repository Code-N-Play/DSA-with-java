public class FindSmallestEvenAndOddNum{
    public static void main (String[] args){

        int[] array = {1,2,3,4,5,-2,6,7,8,9,0};
        int array_len = array.length;
        int min_even_ele = array_len;
        int min_odd_ele = array_len;

        for(int i = 0 ; i < array_len ; i++){
            int ele = array[i];

            if (ele % 2 == 0 && ele < min_even_ele){
                min_even_ele = ele ;
            }
            else if(ele % 2 != 0 && ele < min_odd_ele){
                min_odd_ele = ele ;
            }
        }
        System.out.println(min_even_ele + " is the Smallest Even Number in Array");
        System.out.println(min_odd_ele + " is the Smallest Odd Number in Array");
    }
}