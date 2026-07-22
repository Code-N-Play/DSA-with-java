// what is Spy Number 
// A spy number is a positive integer where the sum of its individual digits is exactly equal to the product of those same digits

// Example = 
// Let's take the number 1124
// Sum of its digits: 1 + 1 + 2 + 4 = 8
// Product of its digits: 1 X 1 X 2 X 4 = 8

import java.util.Scanner;

public class Spy_number{
    public static void main (String[] args){

        System.out.println("Enter the Number....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        String num_str = String.valueOf(input);
        int num_str_len = num_str.length();

        int sum = 0 ; 
        int product = 1;

        for(int i = 0 ; i < num_str_len ; i++){
            int num = num_str.charAt(i) - '0';
            sum = sum + num ;
        }

        for(int j = 0 ; j < num_str_len ; j++){
            int num = num_str.charAt(j) - '0' ;
            product = product * num ;
        }

        if (sum == product){
            System.out.println(input + " is a Spy Number ");
        }
        else{
            System.out.println(input + " is NOT a Spy Number");
        }
    }
}