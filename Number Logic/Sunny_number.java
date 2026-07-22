// What is sunny number 
// A sunny number is a positive integer \(N\) where the very next number ((N + 1)) is a perfect square

// Example = 
// 3 is a sunny number: (3 + 1 = 4), which is (2^2)
// 8 is a sunny number: (8 + 1 = 9), which is (3^2).
// 18 is not a sunny number: (18 + 1 = 19). Because 19 is not a perfect square, 18 is not a sunny number

import java.util.Scanner;

public class Sunny_number{
    public static void main (String[] args){

        System.out.println("Enter the Number....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int new_input = input + 1 ;

        double square_root = Math.sqrt(new_input); // number mai 1 plus krke squre root find kr liya ye decimal mai hoga ya whole number hoga 
        int square_root_int = (int) square_root; // double ko integer mai type cast kr liya agr number ke bad .0 tha to wo hat jaega or agr koi number ke bad log decimal hoga to wo bhi hat jaega 
        
        if( square_root == square_root_int ){ // agr dono same hai to sunny nahi to nahi 
            System.out.println(input + " is a Sunny Number");
        }
        else{
            System.out.println(input + " is NOT a Sunny Number");
        }
        
    }
}