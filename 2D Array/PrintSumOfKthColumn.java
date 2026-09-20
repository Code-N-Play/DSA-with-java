import java.util.Scanner;

public class PrintSumOfKthColumn{
    public static void main (String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0 ; 
        System.out.println("Enter the Column Number to find the sum of that column ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int i = 0 ; i < array.length ; i++){
            sum = sum + array[i][k];
        }

        System.out.println("The sum is : " + sum);
    }
}