// check the number is prime or not 

public class primenum{
    public static void main (String[] args){
        
        int A = 997;
        int B = (A/2)+1; // by using this code become more relaybl
        // agr ye lanthy lag reha to loop mai b ki jagah direct "A" dal do answer same aaega 

        for (int i = 2 ; i<B ; i++){
            if(A % i == 0){
                System.out.println("The number is not a prime ");
                return;
            }
        }
        System.out.println("The number is a prime number");
    }
}