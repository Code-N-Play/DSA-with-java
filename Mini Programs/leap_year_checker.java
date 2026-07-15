import java.util.Scanner;

public class leap_year_checker{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();

        if (Year % 4 == 0  && Year % 100 != 0 || Year % 400 == 0){
            System.out.println(Year + " is a LEAP year ");
        }
        else{
            System.out.println( Year + " is NOT a leap year");
        }
    }
}