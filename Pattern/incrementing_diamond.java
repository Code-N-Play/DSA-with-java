import java.util.Scanner;

public class incrementing_diamond{
    public static void main(String[] args){

        System.out.println("Enter Grid Size");
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt();
        System.out.println("Here is your pattern");

        int l = 3;
       for (int i = 0 ; i < k ; i++){ // left up pattern
            l = 3+i;
            for( int j = 0 ; j <= i ; j++ ){
                
                System.out.print(l); 
                
            }
            System.out.println(" "); // line chang krne ke liye 
        }
        for (int m = 0 ; m < k ; m++){ // left down pattern
            
            l = l-1;

            for (int n = k ; n > m+1 ; n--){
                System.out.print(l);
            }

            System.out.println(" "); // line chang krne ke liye 
        }
       
    }
}

// output for grid size 5
// 3
// 44
// 555
// 6666
// 77777
// 6666
// 555
// 44
// 3