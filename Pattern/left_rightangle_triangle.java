import java.util.Scanner;

public class left_rightangle_triangle{
    public static void main(String[] args){

        System.out.println("Enter Grid Size");
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        System.out.println("Here is your pattern");

        for(int i = 0 ; i < k ; i++){

            for(int j = 0 ; j <= i ; j++){
                System.out.print(j+1); 
            }
            System.out.println("");
        }
       
    }
}

// output for grid size 5
// 1
// 12
// 123
// 1234
// 12345