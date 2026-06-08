// check the given number is palindrome or not 

public class checkpalindrome {
    public static void main ( String [] args ){

        String A = "12322221";

        String B = "";

        for ( int i = A.length() - 1 ; i>=0 ; i--){
            B = B + A.charAt(i);
        }
        
        if ( A.equals(B) ){
            System.out.println("the number is palindrome ");
        }

        else{
            System.out.println("not a palindrome");
        }
    }
}