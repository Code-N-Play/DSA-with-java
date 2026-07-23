import java.util.Scanner;

public class Happy_number {

    public static void main(String[] args) {

        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        while (input != 1 && input != 4) {

            int sum = 0;

            while (input > 0) {
                int digit = input % 10;
                int sqr = digit * digit ;
                sum = sum + sqr ;
                input = input / 10;
            }

            input = sum;
        }

        if (input == 1)
            System.out.println("Entered is a Happy Number");
        else
            System.out.println("Entered is NOT a Happy Number");
    }
}