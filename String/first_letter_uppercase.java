import java.util.Scanner;

public class first_letter_uppercase{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(" "); // converting String into array
        int words_len = words.length; // finding array length

        for(int i = 0 ; i < words_len ; i++){
            words[i] = capitel(words[i]); // applying capital function to each word of array 
        }

        String new_string = String.join(" ", words); // after performing task joining array element to make a string
        System.out.println(new_string); // printing the string 



    }

    public static String capitel(String word){ // capital function which makes each words first word capital

        if (word.length() == 0){
            System.out.println("Empty string");
            return "";
        }

        char first_character = word.charAt(0); // find words first character
        String first_character_up = (first_character + "").toUpperCase(); // converting character to string and making it capital 
        String rest_character = word.substring(1).toLowerCase(); // make sure rest character is small

        return first_character_up + rest_character; // reture the concatinated string 

    }
}