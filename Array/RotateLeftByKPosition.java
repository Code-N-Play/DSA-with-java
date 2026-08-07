import java.util.Scanner;

public class RotateLeftByKPosition{
    public static void main(String[] args){

        System.out.println("Enter how many position do you want to rotate Array ....");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] array = {1,2,3,4,5,6,7,8,9};
        int array_len = array.length;
        int temp = 0 ;

        for(int j = 0 ; j < k ; j++){
            for(int i = 0 ; i < array_len-1 ; i++){
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp ;
            }
        }
        System.out.println("Array After " + k + " Position Rotation ");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}