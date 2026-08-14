import java.util.Scanner;

public class FIndSubArrayBySum{
    public static void main(String[] args){

        int[] array = {1,2,3,4};
        int array_len = array.length;
        int sum = 0 ; 

        System.out.println("Enter the sub narray sum which you want to find : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int index = 0;

        for(int i = 0 ; i < array_len ; i++){
            for(int j = i ; j < array_len ; j++){
                sum = 0;
                for(int k = i ; k <= j ; k++ ){
                    sum = sum + array[k];
                    if (sum == input){
                        index = i;
                    }
                }
            }
        }

         for(int i = 0 ; i < array_len ; i++){
            for(int j = i ; j < array_len ; j++){
                for(int k = i ; k <= j ; k++ ){
                    if (i == index){
                        System.out.print( array[k] + ", ");
                    }
                }
            }
        }
        

    }
}
        

  