import java.util.Scanner;

public class String_counting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int string_len = str.length();

        int vowel_count = 0;
        int consonent_count = 0;
        int digit_count = 0;
        int space_count = 0;

        for (int i = 0 ; i < string_len ; i++){

            char Character = str.charAt(i);
            
            if (Character == 'a' || Character == 'e' ||Character == 'i' ||Character == 'o' ||Character == 'u'||Character == 'A' || Character == 'E' ||Character == 'I' ||Character == 'O' ||Character == 'U'){
                vowel_count = vowel_count + 1;
            }

            else if (Character == ' '){
                space_count = space_count + 1 ;
            }

            else if (Character == '1' ||Character == '2' ||Character == '3' ||Character == '4' ||Character == '5' ||Character == '6' ||Character == '7' ||Character == '8' ||Character == '9' ||Character == '0' ){
                digit_count = digit_count + 1 ;
            }
            else{
                consonent_count = consonent_count + 1;
            }
        }

        System.out.println("Vowel = " + vowel_count);
        System.out.println("Consonent = " + consonent_count);
        System.out.println("Space = " + space_count);
        System.out.println("Digit = " + digit_count);
    } 
}