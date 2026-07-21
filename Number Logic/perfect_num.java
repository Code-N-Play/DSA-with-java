// what is perfect Number :- 
// a perfect number is a positive integer that is exactly equal to the sum of its proper positive divisors (excluding the number itself)

// example :- 6: The proper divisors of (6) are (1, 2, 3).
// Sum: (1 + 2 + 3 = 6)

import java.util.Scanner;

public class perfect_num{
    public static void main (String[] args){

        System.out.println("Enter the Number...");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int perfect = 0 ;

        for (int i = 1 ; i < num ; i++){
            int divisor = num % i ;
            if ( divisor == 0){
                perfect = perfect + i;
            }
        }

    
        if (num == perfect){
            System.out.println("Entered Number " + num + " is Perfect Number");
        }
        else{
            System.out.println("Entered Number " + num + " is NOT a Perfect Number");
        }
    }
}
