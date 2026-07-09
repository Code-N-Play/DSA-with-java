import java.util.Scanner;

public class count_of_vowels{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int Len = str.length();
        int count = 0 ;

        for(int i = 0 ; i <= Len - 1 ; i++){
            char Char = str.charAt(i);

            if(Char == 'a' || Char == 'e' || Char == 'i' || Char == 'o' || Char == 'u' ){
                count = count + 1;
            }
            
        }

        System.out.println(count);
        
    }
}