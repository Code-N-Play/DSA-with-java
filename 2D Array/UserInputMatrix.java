import java.util.Scanner;

public class UserInputMatrix{
    public static void main (String[] args){

        System.out.println("Enter the Row count : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter the Column Count : ");
        int column = sc.nextInt();
        int[][] array = new int[row][column];

        System.out.println("Enter the value that you want in your matrix");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Result");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}