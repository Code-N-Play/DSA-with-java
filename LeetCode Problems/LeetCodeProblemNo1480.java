public class LeetCodeProblemNo1480{
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4};
        int array_len = array.length;
        int current = 0;

        for (int i = 1; i < array_len; i++){
            array[i] = array [i] + array[i-1];
        }

        System.out.println("Running Sum of Array :");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
        
    }
}
