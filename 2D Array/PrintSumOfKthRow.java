import java.util.Scanner;

public class PrintSumOfKthRow{
    public static void main (String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0 ; 
        System.out.println("Enter the row Number to Find the sum of that row ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for(int j = 0 ; j < array[0].length ; j++){
            sum = sum + array[k][j];
        }
        System.out.println("The sum is : " + sum);
    }
}