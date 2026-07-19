import java.util.Scanner;

public class Electricity_bill_calc{
    public static void main (String[] args ){

        System.out.println("....Welcome to the Electricity bill Calculator ....");

        System.out.println("Enetr Unit..");
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();

        System.out.println("Enetr per unit price in your area...");
        int price = sc.nextInt();

        int bill = unit * price ; 
        System.out.println("Your total bill is... " + bill);

    }
}