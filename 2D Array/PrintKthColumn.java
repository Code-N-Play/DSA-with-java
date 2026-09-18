import java.util.Scanner;

public class PrintKthColumn{
    public static void main (String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Enter the colum number which you want to print ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // using single loop
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i][k] + " ");
        }
        System.out.println();

        // by using 2 loops
        // for(int i = 0 ; i < array.length ; i++){
        //     for(int j = 0 ; j < array[0].length ; j++){
        //         if (k == j ){
        //             System.out.print(array[i][j] + " ");
        //         }

        //     }
            
        // }
    }
}