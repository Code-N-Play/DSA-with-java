import java.util.Scanner;

public class RemoveSpace{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in which you want to remove spaces ....");
        String input = sc.nextLine();
        int input_len = input.length();

        for (int i = 0 ; i < input_len ; i++){
            char character = input.charAt(i);
            String char_str = String.valueOf(character);

            if (char_str.equals(" ")){
                System.out.print("");

            }
            else{
                System.out.print(input.charAt(i));
            }
        }
        System.out.println("");
    }
}