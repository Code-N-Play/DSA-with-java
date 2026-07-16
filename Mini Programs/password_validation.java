import java.util.Scanner;

public class password_validation{
    public static void main (String[] args){

        int orignal_password = 123456789;

        System.out.println("....Enter your password....");
        Scanner sc = new Scanner(System.in);
        int password = 0 ;

        do{

            password = sc.nextInt();

            if (orignal_password == password){
                System.out.println("....Password matched....");
            }
           
            else {
                System.out.println("....Password NOT matched....");
            }
        }while( password != orignal_password);
    }
}