import java.util.Scanner;

public class TwoElementSumEqualTarget{
    public static void main (String[] args){

        int[] array = {1,5,4,4,2,7,8,9,3,6};
        int array_len = array.length;
        System.out.println("Enter the target Value ....");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ele1 = 0;
        int ele2 = 0;
        boolean not_print = true ;

        for(int i = 0 ; i < array_len ; i++){
            ele1 = array[i];
            for(int j = 0 ; j < array_len ; j++){
                ele2 = array[j];
                int sum = ele1 + ele2;
                if(sum == target && i != j){
                    System.out.println(ele1 + " And " + ele2 + " Sum is Equals to Target value : " + target);
                    not_print = false ;
                }   
            }
        }
        if(not_print){
            System.out.println("Array don't contain element whoes sum is equal to taget : " + target);
        }

    }
}