import java.util.Scanner;

public class FindTheShortestSubArrayByGivenSum{
    public static void main (String[] args){

        int[] array = {1,1,1,2,4,5,7};
        int array_len = array.length;
        int sum = 0 ; 
        int minimum = array_len;
        int starting = 0 ; 
        int ending = 0 ;
        int diff = 0 ;

        System.out.println("Enter the SubArray sum ....");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 0 ; i < array_len ; i++){
            for(int j = i ; j < array_len ; j++){
                sum = 0 ;
                for(int k = i ; k <= j ; k++ ){
                    sum = sum + array[k];
                }
                if(sum == input){
                    diff = j-i ;
                    if(diff < minimum){
                        starting = i ;
                        ending = j ;
                    }
                }
            }
        }

        for(int i = starting ; i <= ending ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}