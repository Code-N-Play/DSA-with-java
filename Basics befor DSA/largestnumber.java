// find the largest value from 3 numbers 

public class largestnumber{
    public static void main( String [] args){

        int A = 12;
        int B = 1223;
        int C = 14;

        if (A>B && A>C){
            System.out.println("A is largest");
        }

        else if (B>A && B>C){
            System.out.println("B is largest");
        }

        else if (C>A && C>B){
            System.out.println("C is largest");
        }

        else{
            System.out.println("All are same ");
        }
    }
}