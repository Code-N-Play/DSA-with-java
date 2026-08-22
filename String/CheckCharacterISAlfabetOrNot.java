import java.util.Scanner;

public class CheckCharacterISAlfabetOrNot{
    public static void main (String[] args ){

        System.out.println("Enter Which you want to check ....");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int input_len = input.length();

        System.out.println("Result ....");
        for(int i = 0 ; i < input_len ; i++){
            char ch = input.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122){
                System.out.println("Aplphabet");
            }
            else if(ascii >= 48 && ascii <= 57){
                System.out.println("Digit");
            }
            else{
                System.out.println("Something Else");
            }
        }
    }
}