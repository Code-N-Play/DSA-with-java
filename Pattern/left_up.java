import java.util.Scanner;

public class left_up{
    public static void main (String[] args){

        System.out.println("Enter Grid Size");
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        System.out.println("Here is your pattern");

        for (int i = 0 ; i < k ; i++){
            
            for( int j = 0 ; j <= i ; j++ ){
                System.out.print("*"); 
                
            }
            System.out.println(" "); // line chang krne ke liye 
        }
    }
}


// output for gride size 5
// *
// **
// ***
// ****
// *****