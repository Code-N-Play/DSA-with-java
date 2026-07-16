import java.util.Scanner;

public class Guess_the_num{
    public static void main (String[] args){

        double Random = Math.floor(Math.random() * 100) + 1 ;
        
        System.out.println("Guess the num between 1 to 100");

        
        Scanner sc = new Scanner(System.in);
        int Guess = 0 ;

        do{
       
            Guess = sc.nextInt();
            if (Random > Guess){
                System.out.println("your Guess is too low");
            }

            else if ( Random < Guess){
                System.out.println("your Guess is too high");
            }

            else{
                System.out.println("You Guessed the num.... ");
            }
            }while(Random != Guess );
    }
}