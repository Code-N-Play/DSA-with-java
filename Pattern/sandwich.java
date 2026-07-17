import java.util.Scanner;

public class sandwich{
    public static void main (String[] args){

        System.out.println("Enter Grid Size");
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        System.out.println("Here is your pattern");

        int l = 2;

        for(int i = k ; i >= 0 ; i--){
            l = l+1;
            for(int j = k - i; j > 0; j--){
                System.out.print(" ");
            }

            for(int j = 0; j < ((i*2) + 1); j++){
                System.out.print(l);
                
            }
             

            System.out.println("");
        }
        for(int i = 1 ; i < k+1 ; i++){
            l = l-1;
            for(int j = k - i; j > 0; j--){
                System.out.print(" ");
            }

            for(int j = 0; j < ((i*2) + 1); j++){
                System.out.print(l);
            }
             

            System.out.println("");
        }

        
    }
}
// output for grid size 2
// 33333
//  444
//   5
//  444
// 33333