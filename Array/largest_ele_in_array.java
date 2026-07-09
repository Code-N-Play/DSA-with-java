public class largest_ele_in_array{
    public static void main(String [] args){

        int[] Arr = {1,222,3,12,5,36};
        int array_len = Arr.length;

        int temp = 0;

        for(int i = 0 ; i < array_len ; i++){
            int element = Arr[i];

            if (temp < element){
                temp = element;
            }
        
        }

        System.out.println("The Largest num in Array is " + temp);
    }
}