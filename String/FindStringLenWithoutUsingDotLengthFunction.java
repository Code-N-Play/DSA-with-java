import java.util.Scanner;

public class FindStringLenWithoutUsingDotLengthFunction{
    public static void main (String[] args){


        System.out.println("Enter the String or Word to find the Length ....");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int length = input.lastIndexOf("");

        System.out.println("The lesngth is : " + length);
    }
}