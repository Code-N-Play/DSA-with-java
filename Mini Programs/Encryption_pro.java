import java.util.Scanner;
// Ascii number based Encryptor 
public class Encryption_pro{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int default_key = 4;
       
        do{
            System.out.println("....Welcome to java Message Encryptor....");

            System.out.println("Message Encryption.... 1");
            System.out.println("Message Decryption .... 2");
            System.out.println("Set Encryption key.... 3");
            System.out.println("See Encryption key.... 4");

            
            String input = "";
            int input_len = 0; 
            String final_output = "";
            int menu = sc.nextInt();

            if(menu == 1){
                System.out.println("....Message Encryption....");
                System.out.println("Enter Message ");
                Scanner ip = new Scanner(System.in);
                input = ip.nextLine(); // taking input
                input_len = input.length();  // finding input length
                for(int i = 0 ; i < input_len  ; i++){ // itrating
                    char outputchar = input.charAt (i); // one by one cahracter geting
                    int ascii = (int) outputchar; // char to ascii
                    ascii = ascii + default_key ; // ascii value plus key value
                    int output = ascii; // strore ascii 
                    char outascii = (char) ascii; // ascii to char 
                    final_output = final_output + outascii; // combinig char to make result
                }
                System.out.println("Your Encrypted Message is ");
                System.out.println(final_output);
            }

            else if(menu == 2){
                System.out.println("....Message Decryption....");
                System.out.println("Enter Message ");
                Scanner ip = new Scanner(System.in);
                input = ip.nextLine();
                input_len = input.length(); 
                for(int i = 0 ; i < input_len  ; i++){
                    char outputchar = input.charAt (i);
                    int ascii = (int) outputchar;
                    ascii = ascii - default_key ;
                    int output = ascii;
                    char outascii = (char) ascii;
                    final_output = final_output + outascii;
                }
                System.out.println("Your Decrypted Message is ");
                System.out.println(final_output);
            }

            else if (menu == 3){
                System.out.println("....Set Encryption key....");

                System.out.println("Enter your privious Encryption key Number ");
                Scanner ip = new Scanner(System.in);
                int match = ip.nextInt();

                if(match == default_key ){
                    System.out.println("Enter NEW Encryption key Number between (1 to 10) ");
                    int input_key = ip.nextInt();

                    default_key = input_key;
                }
                else{
                    System.out.println("Get OUT from Here ...............");
                }
            }

            else if (menu == 4){
                System.out.println("....See Encryption key....");

                System.out.println("Your Encryption key is ");
                System.out.println(default_key);
            
            }
        }while(true);
       
    }
}