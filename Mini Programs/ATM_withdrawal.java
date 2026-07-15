import java.util.Scanner;

public class ATM_withdrawal{
    public static void main (String[] args){

        int orignal_pin = 1234;
        int Balance = 20000;

       while(true){
            System.out.println(".........Java ATM ...........");

        System.out.println("Cash Withdrawal.................1");
        System.out.println("Balance Inquiry.................2");
        System.out.println("PIN Change......................3");

        Scanner op = new Scanner(System.in);
        int option = op.nextInt();

        if (option == 1 ){
            System.out.println(".......Cash Withdrawal.......");

            System.out.println("Enter the Amount");

            Scanner ac = new Scanner(System.in);
            int Amount = ac.nextInt();


            if (Amount != 0){
                System.out.println("Enter the pin"); 
            
                Scanner sc = new Scanner(System.in);
                int pin = sc.nextInt();

                if(pin == orignal_pin){
                    System.out.println("Collect your money");
                    Balance = Balance - Amount ;
                }
                else{
                    System.out.println("Enterd pin is Wrong"); 
                }
            }
        }

        else if (option == 2 ){
            System.out.println(".......Balance Inquiry.......");
            
            System.out.println("Enter the pin"); 
            
                Scanner ba = new Scanner(System.in);
                int pin = ba.nextInt();

                if(pin == orignal_pin){
                    System.out.println("Your Balance is " + Balance ); 
                }
                else{
                    System.out.println("Enterd pin is Wrong"); 
                }
        }
        else if (option == 3 ){
            System.out.println(".......PIN Change.......");
            
            System.out.println("Enter your privious pin"); 
            
                Scanner ba = new Scanner(System.in);
                int pin = ba.nextInt();

                if(pin == orignal_pin){
                    System.out.println("Enter new 4 digit pin" ); 
                    Scanner newpin = new Scanner(System.in);
                    int npin = newpin.nextInt();

                    if(npin != orignal_pin){
                        System.out.println("PIN changed");
                        orignal_pin = npin;
                    }
                    else if (npin == orignal_pin){
                        System.out.println("try Something new....");
                        Scanner renewpin = new Scanner(System.in);
                        int renpin = renewpin.nextInt();
                    }
                    
                }
                else{
                    System.out.println("Enterd pin is Wrong"); 
                }
        }
        else{
            return ;
        }
        
       }
    }
}