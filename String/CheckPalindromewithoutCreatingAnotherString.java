import java.util.Scanner;

public class CheckPalindromewithoutCreatingAnotherString{
    public static void main (String[] args){

        System.out.println("Enter the String which you want to check ....");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int str_len = input.length();
        int mid = Math.round(str_len/2);
        int correctness = 0 ;
        

        for(int i = 0 ; i < mid ; i++){
            String char1 = String.valueOf(input.charAt(i));
            String char2 = String.valueOf(input.charAt((str_len-1)-i));
            if (char1.equals(char2)){
                correctness = correctness+1;
            }
        }

        if(correctness == mid){
            System.out.println("Given String is Palindrom");
        }
        else{
            System.out.println("Given String not a is Palindrom");
        }

        
    }

}