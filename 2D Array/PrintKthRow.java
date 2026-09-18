import java.util.Scanner;

public class PrintKthRow{
    public static void main (String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row Number Which you want to print");
        int k = sc.nextInt();

        // by using a single loop
        for(int i = 0 ; i < array[0].length ; i++){
            System.out.print(array[k][i]+" ");
        }
        System.out.println();

        // by using 2 loops 
        // for(int i = 0 ; i < array.length ; i++){
        //     for(int j = 0 ; j < array[0].length ; j++){
        //         if (i == k){
        //             System.out.print(array[i][j] + " ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}