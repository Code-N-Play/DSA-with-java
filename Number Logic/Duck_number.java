// What is Duck Number 
// A duck number is a positive number that contains at least one zero in its digits, but does not begin with zero

// Example = 
// Duck Numbers: 105, 2005, 3210
// Not Duck Numbers: 0125 (starts with zero), 4567 (no zeros)


import java.util.Scanner;

public class Duck_number{
    public static void main (String[ ] args){

        System.out.println("Enter the Number....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // Approach no - 01 (easiest)
        String input_str = String.valueOf(input); // string mai convert krne pr agr input ke first index pr 0 hoga to remove ho jaega 
        
        
        if (input_str.contains("0")){ // string ka function use kr liya kya string 0 contain krta hai ha to duck number hai nahi to nahi hai 
            System.out.println(input + " is a Duck Number");
        }
        else{
            System.out.println( input + " is NOT a Duck Number");
        }



        // Approach no - 02 (lanthy)
        String input_str2 = String.valueOf(input);
        int input_str2_len = input_str2.length();
        boolean status = false ;

        for(int i = 0 ; i < input_str2_len ; i++){ // puri string ko one by one check karo 
            int num = input_str2.charAt(i) - '0';
            if (num == 0 ){
                status = true ; // agr string mai 0 mile to status true kr do werna false hi rehne do 
            }
        }

        if (status == true ){
            System.out.println(input + " is a Duck Number");
        }
        else{
            System.out.println( input + " is NOT a Duck Number");
        }
    }
}