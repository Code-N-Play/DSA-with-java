import java.util.Scanner;

public class FindKthLargestElement{
    public static void main (String[] args ){

        int[] array = {1,2,5,55,485,458,63,478,45,55};
        int array_len = array.length;
        int max_ele = 0 ;
        int output = 0 ;

        System.out.println("Enter The position....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int j = 0 ; j < input ; j++){
            for(int i = 0 ; i < array_len ; i++){
                int ele = array[i];
                if (ele > max_ele ){
                    max_ele = ele;
                }
            }
            output = max_ele ;
            for(int i = 0 ; i < array_len ; i++){
                if(array[i] == max_ele ){
                    array[i] = 0 ;
                }
            }
            max_ele = 0 ; 
        }

        System.out.println(input + "th Largest Element is " + output);

    }
}