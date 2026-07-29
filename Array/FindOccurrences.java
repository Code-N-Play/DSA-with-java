import java.util.Scanner;

public class FindOccurrences{
    public static void main (String[] args){

        System.out.println("Enter the Number whoes occurrences you want to count ....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[] array = {1,4,5,8,6,44,5,9,2,4,5,6};
        int array_len = array.length;

        boolean occurrences = false;
        int count = 0;

        for(int i = 0 ; i < array_len ; i++){
            int ele = array[i];
            if(input == ele){
                count = count + 1 ;
                occurrences = true;
            }
        }

        if (occurrences){
            System.out.println("The Occurrenes of Element " + input +  " is " + count);
        }
        else{
            System.out.println("The Element " + input +  " is not available in Array ");
        }
    }
}