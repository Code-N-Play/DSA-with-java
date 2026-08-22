import java.util.Scanner;

public class ConvertToUpperCasewithoutUsingFunction{
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
            for(int lwr = 0 ; lwr < lowwer.length ; lwr++){
                str = String.valueOf(input.charAt(i));
                if(str.equals(lowwer[lwr]) || str.equals(upper[lwr]) ){
                    index = lwr;
                }
            }
        
            
            for(int upr = 0 ; upr < upper.length ; upr++){
                
                if(index == upr){
                    System.out.print(upper[upr]); 
                }
                
            }
        }
        System.out.println("");
    }
}