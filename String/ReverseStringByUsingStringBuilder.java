import java.lang.*;
import java.util.Scanner;

public class ReverseStringByUsingStringBuilder{
    public static void main(String[] args){

        System.out.println("Enter the String Wich you want to reverse ....");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int input_len = input.length();

        StringBuilder sb = new StringBuilder(""); // StringBuilder string (empty)

        for(int i = input_len-1 ; i >= 0; i--){
            String str = String.valueOf(input.charAt(i)) ;
            sb.append(str); // it is used to append char at last 
        }

        String output = sb.toString(); // it is used to build a string by string builder method
       System.out.println("Reverse String : "+ output );
    }
}