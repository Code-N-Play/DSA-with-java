import java.util.Scanner;

public class Rock_paper_scissor{
    public static void main (String[] args){

        double Random = Math.floor(Math.random() * 3) + 1 ;

        String Computer = "";
        String User_pic = "";

        if( Random == 1.0){
            Computer = "Rock";
        }
        else if( Random == 2.0){
            Computer = "Paper";
        }
        else if( Random == 3.0){
            Computer = "Scissor";
        }

        System.out.println("...Your Turn ...");
        System.out.println("1 = Rock , 2 = Paper , 3 = Scissor");

        Scanner sc = new Scanner(System.in);
        int pic = sc.nextInt();

        if( pic == 1){
            User_pic = "Rock";
        }
        else if( pic == 2){
            User_pic = "Paper";
        }
        else if( pic == 3){
            User_pic = "Scissor";
        }
        
        System.out.println("Your Pic -> " + User_pic);
        System.out.println("Computer's Pic -> " + Computer);

        if(User_pic == Computer){
            System.out.println("......Draw.....");
        }
        else if ((Computer == "Rock" && User_pic == "Paper") || (Computer == "Paper" && User_pic == "Scissor" ) || ( Computer == "Scissor" && User_pic == "Rock") ){
            System.out.println("......You Won.....");
        }
        else{
          System.out.println("......Computer Won.....");  
        }
       
    }
}