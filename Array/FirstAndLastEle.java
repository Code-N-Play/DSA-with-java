public class FirstAndLastEle{
    public static void main (String[] args){

        int[] array = {1,4,8,5,7,6,9,2,3};
        int array_len = array.length;

        int first_ele = array[0] ;
        int Last_ele = array[array_len - 1];

        System.out.println("First Element of array is " + first_ele);
        System.out.println("Last Element of array is " + Last_ele);

        
    }
}