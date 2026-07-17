import java.util.Scanner;

public class incrementing_num{
    public static void main(String[] args){

        System.out.println("Enter Grid Size");
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        System.out.println("Here is your pattern");

        for(int i = 0 ; i < k ; i++){

            for(int j = 1 ; j < k + 1 ; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
       
    }
}