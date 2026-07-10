import java.util.Scanner;

public class Check_palindrome{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int string_len = str.length();
        String reverse_string = ""; 


        for (int i = 0 ; i < string_len ; i++){
            reverse_string = str.charAt(i) + reverse_string;
        }

        if (str.equals(reverse_string)){
            System.out.println("Given String is palindrome");
        
        }
        else{
           System.out.println("Given String is not a palindrome"); 
        }
    }
}