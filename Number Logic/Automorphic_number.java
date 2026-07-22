// what is Automorphic number 
// An automorphic number is an integer whose square ends with the exact same digits as the number itself

// Example =
// (5): (5^2 = 25) (ends in (5))
// more:= 6 25 625 and many more

import java.util.Scanner;

public class Automorphic_number{
    public static void main (String[] args){

        System.out.println("Enter the Number....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int square = input * input ;

        String input_str = String.valueOf(input);
        String square_str = String.valueOf(square);

        if(square_str.endsWith(input_str)){ // .endsWith(str) string ka predefine function use kiya hai jo check krta hai bracket mai jo hai kya string uske sath end ho rehi hai ya nahi
            System.out.println(input + " is a Automorphic Number");
        } 
        else {
            System.out.println( input + " is NOT a Automorphic Number");
        }
    }
}