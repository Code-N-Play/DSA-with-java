public class factorial{

    public static void main( String[] args){

        int A = 10;
        int factorial = 1;

        for ( int i = 1 ; i<=A ; i++){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }    
}