// print all prime number in range 

public class printallprime {
    public static void main ( String[] args){

        int A = 100;

        for (int J = 2; J<=A ; J++){
            for (int i = 2 ; i<J ; i++){
                if (J % i == 0){
                    System.out.println("The number is not a prime");
                    
                }
            }
            System.out.println(J);
        }

    }
}