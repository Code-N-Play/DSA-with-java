import java.util.Scanner;

public class RotatePortionOfArray{
    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7};
        int array_len = array.length;
        int temp = 0 ;
        int a=0;
        int b=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Portion Starting Index ....");
        int start = sc.nextInt();
        System.out.println("Enter the Portion Ending Index ....");
        int end = sc.nextInt();
        System.out.println("Enter the Rotation value ....");
        int k = sc.nextInt();

        int new_array_len = (end-start)+1; 
        int[] new_array = new int[new_array_len];
        for(int i = start ; i <= end ; i++){
            new_array[a] = array[i];
            a=a+1;
        }

        for(int i = 0 ; i < k ; i++){
            for(int j = 0 ; j < new_array_len-1 ; j++ ){
                temp = new_array[j];
                new_array[j] = new_array[j+1];
                new_array[j+1] = temp ;
            }
        }

        for(int i = 0 ; i < array_len ; i++){
            if (i >= start && i <= end){
                array[i] = new_array[b];
                b=b+1;
            }
            else{
                array[i] = array[i];
            }
        }

        System.out.println("Final Rotated Array ");
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}