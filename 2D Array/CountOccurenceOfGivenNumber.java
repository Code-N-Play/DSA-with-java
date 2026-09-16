import java.util.Scanner;

public class CountOccurenceOfGivenNumber{
    public static void main(String[] args){

        int[][] array = {{1,2,3},{1,2,4},{5,6,8}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number whose occurence do you want to know");
        int find = sc.nextInt();
        int occurence = 0 ;

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){

                if (find == array[i][j]){
                    occurence = occurence + 1;
                }
            }
        }
        System.out.println("The Occurence of " + find + " is " + occurence);

    }
}