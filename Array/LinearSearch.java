import java.util.Scanner;

public class LinearSearch{
    public static void main (String[] args){

        // linear search in static (predefind) array

        // int[] array = {1,2,3,4,5,6,7,8,9};
        // int array_len = array.length;

        // System.out.println("Enter the Number which you want to search ");
        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();
        // boolean contains = false;
        // int index = 0;

        // for(int i = 0 ; i < array_len ; i++){
        //     if (input == array[i]){
        //         contains = true;
        //         index = i ;
        //     }
        // }

        // if (contains){
        //     System.out.println(input + " is found in Array at index of " + index);
        // }
        // else{
        //      System.out.println(input + " is NOT found in Array");
        // }



        // linear search for dynamic array (user input array) 
        Scanner sc = new Scanner(System.in);

        System.out.println("Array Linear Search programe....");
        System.out.println("");

        System.out.println("Enter the Size of Array....");
        int array_len = sc.nextInt();
        int[] array = new int[array_len];

        System.out.println(" ");
        System.out.println("Enter the Element of Array....");
        for(int i = 0 ; i < array_len ; i++){ // array elements take by use of for loop
            array[i] = sc.nextInt();
        }

        System.out.println(" ");
        System.out.println("Enter the Element Which you Want to find....");
        int input = sc.nextInt();
        boolean contains = false;
        int index = 0;

        for(int i = 0 ; i < array_len ; i++){ // main logic for itration and linear search 
            if (array[i] == input){
                contains = true;
                index = i;
            }
        }

        if (contains){
            System.out.println(input + " is found in Array at index of " + index);
        }
        else{
            System.out.println(input + " is NOT found in Array");
        }
        
    }
}