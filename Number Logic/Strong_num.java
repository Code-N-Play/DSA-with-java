// A strong number (also known as a petersonnumber , Krishnamurthy number or a factorion) is a number whose value equals the sum of the factorials of its individual digits.

// Example:- For the number (145), the sum of the factorials of its digits is (1! + 4! + 5! = 1 + 24 + 120 = 145). 

import java.util.Scanner;

public class Strong_num{
    public static void main (String[] args){

        System.out.println("Enter the Number....");
        Scanner sc =  new Scanner(System.in);
        String num = sc.nextLine();
        int num_len = num.length();
        int total = 0;

        for(int i = 0 ; i < num_len ; i++){
            int single_num = num.charAt(i) - '0' ;
            int firstfactorial = 1;
            for(int j = 1 ; j <= single_num ; j++ ){
                firstfactorial = firstfactorial * j ;
                
            }
            total = total + firstfactorial;
            
        }
        
        int inttotal = Integer.valueOf(num);
        
        
        if (inttotal == total){
            System.out.println("Entered Number " + num + " is a Strong Number");
        }
        else{
            System.out.println("Entered Number " + num + " is a Not a Strong Number");
        }

    }
}
