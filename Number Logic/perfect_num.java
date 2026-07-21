import java.util.Scanner;

public class perfect_num{
    public static void main (String[] args){

        System.out.println("Enter the Number...");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int perfect = 0 ;

        for (int i = 1 ; i < num ; i++){
            int divisor = num % i ;
            if ( divisor == 0){
                perfect = perfect + i;
            }
        }

    
        if (num == perfect){
            System.out.println("Entered Number " + num + " is Perfect Number");
        }
        else{
            System.out.println("Entered Number " + num + " is NOT a Perfect Number");
        }
    }
}