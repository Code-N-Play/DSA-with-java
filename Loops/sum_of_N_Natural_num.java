import java.util.Scanner;

public class sum_of_N_Natural_num{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int sum = 0;

        for (int i = 1 ; i<=A ; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first " + A +" Natural Number is " + sum);
    }
}