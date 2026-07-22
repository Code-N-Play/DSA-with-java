// what is Neon Number 
// A neon number is a positive integer where the sum of the digits of its square is exactly equal to the original number

// Example = 
// For example, (9) is a neon number because its square is (81)
// (i.e., (9 times 9)) and the sum of its digits ((8 + 1)) equals (9)

import java.util.Scanner;

public class Neon_number {
    public static void main (String[] args){

        System.out.println("Enter the Number...");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int squre = input * input;
        String str = String.valueOf(squre);
        int str_len = str.length();
        int result = 0;

        for(int i = 0 ; i < str_len ; i++){
            int num = str.charAt(i) - '0' ;
            result = result + num ; 
            
        }

        
        if (input == result ){
            System.out.println(input + " is a Neon Number");
        }
        else{
            System.out.println(input + " is NOT a Neon Number");
        }
        
    }
}