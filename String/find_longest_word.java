import java.util.Scanner;

public class find_longest_word{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] words = str.split(" ");
        int words_len = words.length;

        int temp = 0;
        String largest_word = "";

        for (int i = 0 ; i < words_len ; i++){
            String word = words[i];
            int word_length = word.length();

            if (word_length > temp ){
                temp =  word_length;
                largest_word = word;
            }
        } 

        System.out.println(largest_word);
    }
}