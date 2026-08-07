import java.util.Scanner;

// what Question want 

// array ko right rotate karo
// uske bad pure array ko reverse kr do
// final array print kr do 

public class ReverseArrayAfterRotation{
    public static void main (String[] args){

        System.out.println("Enter the rotation position ....");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] array = {1,2,3,4,5};
        int array_len = array.length;
        int temp = 0 ;

        for(int j = 0 ; j < k ; j++){
            for(int i = array_len -1 ; i > 0 ; i--){
                temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp ;
            }
        }
        int a = array_len-1;
        int[] new_array = new int[array_len];
        for(int i = 0 ; i < array_len ; i++){
            new_array [i] = array[a];
            a=a-1;
        }

        System.out.println("Final Array ");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(new_array[i] + ", ");
        }

    }
}

