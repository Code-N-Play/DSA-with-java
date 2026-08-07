import java.util.Scanner;

public class RotateRightByKPosition{
    public static void main (String[] args){

        System.out.println("Enter How many Right position do you want to rotate array ....");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] array = {1,2,3,4,5,6,7,8,9};
        int array_len = array.length;
        int temp = 0 ;

        for(int j = 0 ; j < k ; j++){
            for(int i = array_len-1 ; i > 0 ; i--){
                temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
            }
        }

        System.out.println("Array After " + k + " Position Rotation");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}