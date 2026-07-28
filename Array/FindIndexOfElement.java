import java.util.Scanner;

public class FindIndexOfElement{
    public static void main (String[] args){


        System.out.println("Enter the Element whose index you want ....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[] array = {11,2,445,78,52,62,32};
        int array_len = array.length;
        int ele_index = 0;
        boolean found = false;

        for(int i = 0 ; i < array_len ; i ++){
            int ele = array[i];
            if (input == ele){
                ele_index = i ;
                found = true;
            }
            
        }

        if (found){
            System.out.println(input + " Element index is : " + ele_index);
        }
        else{
            System.out.println(input + " Element not Exist in Array ... ");
        }
        
    }
}