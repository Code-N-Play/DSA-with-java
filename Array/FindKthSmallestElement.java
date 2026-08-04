import java.util.Scanner;

public class FindKthSmallestElement{
    public static void main (String[] args){

        int[] array = {1,2,45,87,96,56,546,3,5,562,5};
        int array_len = array.length;
        int min_ele = array[0];
        int output = 0;

        System.out.println("Enter The Position....");
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();


        for(int j = 0 ; j < input ; j++){
            for(int i = 0 ; i < array_len ; i++){
                int ele = array[i];
                if (ele < min_ele ){
                    min_ele = ele ;
                }
            } 
            output = min_ele ;
            for(int i = 0 ; i < array_len ; i++){
                if (array[i] == min_ele ){
                    array[i] = 100000000;
                }
            }
            min_ele = array[0];
        }
        System.out.println(input+"th Smallest Element is " + output);
    }
}

// you also solve this question by bellow method

// first sort the array and then Print the k th value wich you take from user 