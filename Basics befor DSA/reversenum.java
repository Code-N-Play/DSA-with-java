// Reverse the number or string 

public class reversenum{
    public static void main (String[] args){

        String A = "123456";
        String Revese = "";

        for (int i = A.length() - 1 ; i>=0 ; i--){
            Revese = Revese + A.charAt(i);
        }
        System.out.println(Revese);
    }
}