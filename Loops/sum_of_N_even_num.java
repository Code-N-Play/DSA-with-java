import java.util.Scanner;

public class sum_of_N_even_num{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int sum = 0 ;

        for (int i = 0 ; i <= A ; i=i+2){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}