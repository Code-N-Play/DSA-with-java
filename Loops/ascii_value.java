import java.util.Scanner;

public class ascii_value{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String or Character to know Ascii value......");
        String str = sc.nextLine();
        int str_len = str.length();
        

        for(int i = 0 ; i < str_len ; i++){
            char character = str.charAt(i);
            int ascii = (int) character ; 
            System.out.println( character + " Ascii value is " + ascii);
        }
    }
}