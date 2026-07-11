import java.util.*; // Hashmap 
import java.util.Scanner;// input
import java.lang.Integer;// integer class of hashmap
import java.lang.Character;// character class of hashmap

public class Character_frequency{
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int string_len = str.length();

        HashMap <Character,Integer> A = new HashMap<>();

        for (int i = 0; i < string_len ; i++){
            char character = str.charAt(i);

            if(A.containsKey(character)){
                int count = A.get(character);
                A.put(character,count+1);
            }
            else{
                A.put(character,1);
            }

        } 

        System.out.println(A);
    }
}







