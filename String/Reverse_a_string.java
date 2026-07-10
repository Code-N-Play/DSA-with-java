import java.util.Scanner;

public class Reverse_a_string{
    public static void main(String[] args){

        Scanner sc =new Scanner (System.in);
        String str = sc.nextLine();

        int string_len = str.length();
        String reverse_string = "" ; 

        for(int i = 0 ; i < string_len ; i++){
            reverse_string = str.charAt(i) + reverse_string ;
        }

        System.out.println(reverse_string);
    }
} 