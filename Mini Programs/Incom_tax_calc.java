import java.util.Scanner;

public class Incom_tax_calc{
    public static void main (String[] args){

        System.out.println("Welcome to the Income Tax calculator.....");

        System.out.println("Enter your annual income....");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();

        if(income <= 400000){
            System.out.println("For your income " + income +  " you don't need to pay any tax.");
        }

        else if(income > 400000 && income <= 800000){
            int tax = income * 5/100;
            System.out.println("For your income " + income +  " you have to pay " + tax + " As a Income Tax.");
        }

        else if(income > 800000 && income <= 1200000){
            int tax = income * 10/100;
            System.out.println("For your income " + income +  " you have to pay " + tax + " As a Income Tax.");
        }

        else if(income > 1200000 && income <= 1600000){
            int tax = income * 15/100;
            System.out.println("For your income " + income +  " you have to pay " + tax + " As a Income Tax.");
        }

        else if(income > 1600000 && income <= 2000000){
            int tax = income * 20/100;
            System.out.println("For your income " + income +  " you have to pay " + tax + " As a Income Tax.");
        }

        else if(income > 2000000 && income <= 2400000){
            int tax = income * 25/100;
            System.out.println("For your income " + income +  " you have to pay " + tax + " As a Income Tax.");
        }

        else {
            int tax = income * 25/100;
            System.out.println("For your income " + income +  " you have to pay " + tax + " As a Income Tax.");
        }
    }
}