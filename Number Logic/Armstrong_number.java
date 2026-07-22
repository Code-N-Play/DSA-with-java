// What is Armstrong number 
// An Armstrong number (also known as a narcissistic number) is an integer that is equal to the sum of its own digits each raised to the power of the total number of digit

// Example =  (153) is a 3-digit number.
// If you take each digit, raise it to the power of (3), and add them together, 
// they equal the original number:(1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153)

import java.util.Scanner;

public class Armstrong_number{
    public static void main (String[] args){

        System.out.println("Enter the Number....");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int input_len = input.length();
        double result = 0 ;

        for(int i = 0 ; i < input_len ; i++){
            int number = input.charAt(i) - '0' ; // ye ascci value dega is liye -'0' kiya taki int mai convert ho jae
            double power = Math.pow(number , input_len );
            result = result + power;
        }

        double inputnum = Double.valueOf(input); // string to double 

        if (inputnum == result){
            System.out.println(input + " is a Armstrong Number");
        }
        else{
            System.out.println(input + " is NOT a Armstrong Number");
        }
    }
}