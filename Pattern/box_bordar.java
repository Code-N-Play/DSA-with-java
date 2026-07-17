import java.util.Scanner;

public class box_bordar{
    public static void main (String[] args){

        System.out.println("Enter the Grid Size");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Here is your pattern");

        for (int i = 0 ; i < k ; i++){

            for(int j = 0 ; j < k ; j++){
                if (j == 0 || j == k-1){
                    System.out.print("*");
                }
                else{
                    if(i == 0 || i== k-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }  
    }
}