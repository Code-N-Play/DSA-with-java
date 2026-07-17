import java.util.Scanner;

public class down_rightangle_triangle{
    public static void main(String[] args){

        System.out.println("Enter Grid Size");
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        System.out.println("Here is your pattern");

        int l = 2;
       for(int i = 0 ; i < k ; i++){
            l = l+1;
           for(int j = k ; j > i ; j--){
            
            System.out.print(l);
           }
            System.out.println("");
       }
       
    }
}

// output for grid size 5
// 33333
// 4444
// 555
// 66
// 7