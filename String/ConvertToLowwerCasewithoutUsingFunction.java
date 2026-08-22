import java.util.Scanner;

public class ConvertToLowwerCasewithoutUsingFunction{
    public static void main (String[] args){

        System.out.println("Enter what you want to convert ....");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        int index = 0;
        String str = "";
        String[] upper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "};
        String[] lowwer = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};


        System.out.println("After Conversion ....");
        for(int i = 0 ; i < len ; i++){
            for(int upr = 0 ; upr < lowwer.length ; upr++){
                str = String.valueOf(input.charAt(i));
                if(str.equals(upper[upr]) || str.equals(lowwer[upr]) ){
                    index = upr;
                }
            }
        
            
            for(int lwr = 0 ; lwr < lowwer.length ; lwr++){
                
                if(index == lwr){
                    System.out.print(lowwer[lwr]); 
                }
                
            }
        }
        System.out.println("");
    }
}