// What is Harshed Number
// A Harshad number (also called a Niven number) is an integer that is perfectly divisible by the sum of its own digits

// Example =
// the number 18 is a Harshad number because the sum of its digits is (1 + 8 = 9),
//  and 18 is perfectly divisible by 9 ((18 div 9 = 2)) 

import java.util.Scanner;

public class Harshed_number{
    public static void main (String[] args){

        System.out.println("Enter the Number....");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        String input_str = String.valueOf(input);
        int input_str_len = input_str.length();
        int sum = 0;

        for (int i = 0 ; i < input_str_len ; i ++){
            int num = input_str.charAt(i) - '0';
            sum = sum + num ;
        }

        if (input % sum == 0 ){
            System.out.println(input + " is a Harshed Number");
        }
        else {
            System.out.println(input + " is NOT a Harshed Number");
        }
    }
}