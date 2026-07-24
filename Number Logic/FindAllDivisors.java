import java.util.Scanner;

public class FindAllDivisors{
    public static void main (String[] args){

        System.out.println("Enter the Numder....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.print( "Devisor of " + input +  " are  ");

        for (int i = 1; i <= input ; i++){
            if (input % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}