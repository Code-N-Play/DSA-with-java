import java.util.Scanner;

public class RemoveAllOccurrancesOfEle{
    public static void main(String[] args){

        int[] array = {1,2,1,3,1,2,5,2,3,4,56,2};
        int array_len = array.length;

        System.out.println("Enter Element which you want to remove....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = 0 ;
        int a = 0; 

        for(int i = 0 ; i < array_len ; i++){
            if (input == array[i]){
                num = num + 1;
            }
        }

        int[] new_array = new int[array_len-num];

        for(int i = 0 ; i < array_len ; i++){
            if (array[i] != input){
                new_array[a] = array[i];
                a = a+1;
            }
        }

        System.out.println("After Removing Element " + input);

        for(int i = 0 ; i < array_len-num ; i++){
            System.out.print(new_array[i] + ", ");
        }
    }
}