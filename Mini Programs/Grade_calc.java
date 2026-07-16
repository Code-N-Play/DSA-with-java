import java.util.Scanner;

public class Grade_calc{
    public static void main (String[] args){

        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90){
            System.out.println("Grade is A+");
        }

        else if (marks <= 80 && marks >= 71){
            System.out.println("Grade is B+");
        }

        else if (marks <= 70 && marks >= 61){
            System.out.println("Grade is C+");
        }
        
        else if (marks <= 60 && marks >= 51){
            System.out.println("Grade is D+");
        }
        
        else if (marks <= 50 && marks >= 41){
            System.out.println("Grade is D-");
        }
        
        else if (marks <= 40 && marks >= 33){
            System.out.println("Grade is E+");
        }
         
        else {
            System.out.println("Grade is F");
        }
    }
}