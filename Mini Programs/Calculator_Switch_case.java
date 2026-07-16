import java.util.Scanner;

public class Calculator_Switch_case{
    public static void main (String[] args){

        System.out.println("....Calculator....");

        System.out.println("Enter First Operand");

        Scanner fop = new Scanner(System.in);
        int first_operand = fop.nextInt();

        System.out.println("Enter Second Operand");

        Scanner sop = new Scanner(System.in);
        int second_operand = sop.nextInt();

        System.out.println("Enter Operator");

        Scanner op = new Scanner(System.in);
        String operator = op.nextLine();

        int Answer ;

        
        
            switch (operator){
                case "+" : Answer = first_operand + second_operand ;
                System.out.println("Your Answer is " + Answer);
                break;

                case "-" : Answer = first_operand - second_operand ;
                System.out.println("Your Answer is " + Answer);
                break;

                case "*" : Answer = first_operand * second_operand ;
                System.out.println("Your Answer is " + Answer);
                break;

                case "/" : Answer = first_operand / second_operand ;
                System.out.println("Your Answer is " + Answer);
                break;

                default : System.out.println("Plese Enter the valid operator ");
            }
            

            
        


    }
}