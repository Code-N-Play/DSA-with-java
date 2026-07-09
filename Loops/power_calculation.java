import java.util.Scanner;
import java.lang.Math; // how to use this  ??

public class power_calculation{
    public static void main(String[] args){


        System.out.println(".............Enter Base Value.........");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println(".............Enter Power Value.........");
        Scanner dc = new Scanner(System.in);
        int B = dc.nextInt();

        int Ans = 0 ;

        for (int i = 2 ; i <= B ; i++ ){
            
            if (Ans==0){
                Ans = A * A ; 
            }
            else {
                Ans = Ans * A ;
            }
        }

        System.out.println("The Answer is " + Ans); // loop based
        System.out.println("The Answer is " + pow(A, B)); // self maked pow function
        System.out.println("The Answer is " + Math.pow(A, B)); // use of math lib 
    }


    //self maked pow function.................

    public static int pow(int num , int pow){
 
        int answer = 1;
        for(int i = 0 ; i < pow ; i++){
            answer = answer * num;
        }

        return answer;
    }
}