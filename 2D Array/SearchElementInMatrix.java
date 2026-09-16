import java.util.Scanner;

public class SearchElementInMatrix{
    public static void main (String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Which you want to Search ein Array ");
        int find = sc.nextInt();

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                if(array[i][j] == find){
                    System.out.println("Number found in Index " + i+ " " + j);
                }
                
            }
           
        }

    }
}