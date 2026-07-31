import java.util.Scanner;

public class FindMissingNum{
    public static void main (String[] args){

        System.out.println("Enter The number....");
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        boolean contain = false ;
        String output = " ";

        int[] array = {1,9,4,5,7,6,3};
        int array_len = array.length;

        for(int i = 1 ; i < input + 1 ; i++){
            int num = i ; 
            for(int j = 0 ; j < array_len ; j++){
                int ele = array[j];
                contain = false ;
                if (num == ele ){
                    contain = true ;
                    break;
                }
            }
            if (!contain){
                output = output + num + " "; 
            }
        }
        System.out.println("The Missing number are :" +  output);
    }
}