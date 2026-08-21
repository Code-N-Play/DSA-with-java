public class LeetCodeProblemNo1929 {
    public static void main(String[] args) {
        int[] array = {1,2,1};
        int array_len = array.length;
        int[] new_array = new int[array_len*2];
        int A = 0;


        for(int i = 0; i<new_array.length ; i++){
            if (i % array_len == 0){
                A=0;
            }
            new_array[i] = array[A];
            A=A+1;
        }


        System.out.println("Concatinated Array ....");

        for(int i=0; i<new_array.length ; i++){
            System.out.print(new_array[i] + ", ");
        }
    }
}
