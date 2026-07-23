import java.util.Scanner;

public class PalindromeNumber{
    public static void main (String[] args){

        System.out.println("Enter the Number....");
        Scanner sc = new Scanner(System.in);
        String input_str = sc.nextLine();

        
        int input_len = input_str.length();
        
        String output_str = "";

        for ( int i = input_len-1 ; i >=0 ; i--){
            char num = input_str.charAt(i) ;
            output_str = output_str + num;
        }


        if (input_str.equals(output_str) ){
            System.out.println(input_str + " is a Palindrome Number");
        }
        else{
            System.out.println(input_str + " is NOT a Palindrome Number");
        }
    }

}