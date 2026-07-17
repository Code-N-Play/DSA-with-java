import java.util.Scanner;

public class number_box{
    public static void main(String[] args){

        System.out.println("Enter Grid Size");
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        System.out.println("Here is your pattern");

        for (int i = 0 ; i < k ; i ++){

            for (int j = 0 ; j < k ; j++){
                System.out.print("1"); // in that we have to print "1"
            }
            System.out.println(" ");
        }
       
    }
}

// output for grid size 5
// 11111
// 11111
// 11111
// 11111
// 11111