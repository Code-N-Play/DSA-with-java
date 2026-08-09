import java.util.Scanner;

public class leftRotationUsingTemporaryArray{
    public static void main (String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9};
        int array_len = array.length;
        int temp = 0;
        int a =0;

        System.out.println("How many element do you want to left rotate ....");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] temp_array = new int[k];
        for(int i = 0 ; i < k ; i++){
            temp_array[i] = array[i];
            array[i] = 0 ;
        }

        for(int j =0 ; j < k ; j++){
            for(int i = 0 ; i < array_len-1 ; i++){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }

        }

        for(int i = 0 ; i < array_len ; i++){
            if(array[i] == 0){
                array[i] = temp_array[a];
                a=a+1;
            }
        }

        System.out.println("Final Array ");
        for(int i = 0 ; i < array_len ;i++){
            System.out.print(array[i] + ", ");
        }
    }
}