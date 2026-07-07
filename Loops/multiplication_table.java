import java.util.Scanner;

public class multiplication_table{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        for (int i = 1 ; i <= 10 ; i++){
            int table = A*i;
            System.out.println(A + "X" + i + "=" + table );
        }


    }
}