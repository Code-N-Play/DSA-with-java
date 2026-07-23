// GDC / HCF = gratest common divisor / hightest common factor

import java.util.Scanner;

public class HCF{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number....");
        int a = sc.nextInt();
        System.out.println("Enter Second Number....");
        int b = sc.nextInt();

        int a_divisor = 0 ;
        int b_divisor = 0 ;
        int hcf = 0 ;

        for (int i = 1 ; i <= a ; i++){
            int num_1 = i ; 

            if (a % num_1 == 0){
                a_divisor = num_1 ;

                for (int j = 1 ; j <= b ; j++){
                    int num_2 = j ;
                    
                    if (b % num_2 == 0){
                        b_divisor = num_2 ;

                        if (a_divisor == b_divisor){
                            hcf = a_divisor;
                        }

                    }
                }
            }
        }

        System.out.println("The HCF of " + a + " and " + b + " is " + hcf );
    }
}