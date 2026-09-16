// 832. Flipping an Image

// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
// For example, inverting [0,1,1] results in [1,0,0].
 

// Example 1:
// Input: image = [[1,1,0],[1,0,1],[0,0,0]]
// Output: [[1,0,0],[0,1,0],[1,1,1]]
// Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
// Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

// Example 2:
// Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
// Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
// Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
// Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]



// MY Solution:-
public class LeetCodeProblemNo832{
    public static void main (String[] args){

        int[][] array = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] new_array = new int[array.length][array[0].length];
        int a = 0 ;

        for(int i = 0 ; i < array.length ; i++){
            a = 0 ;
            for(int j = array[0].length-1 ; j >= 0 ; j--){

                new_array[i][a] = array[i][j];
                a = a+1;
            }
        }

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[0].length ; j++){
                if(new_array[i][j]==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
                
            }
            System.out.println("");
        }


    }
}


//Leetcode compatible Solution :-
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         int[][] new_array = new int[image.length][image[0].length];
        int a = 0 ;

        for(int i = 0 ; i < image.length ; i++){
            a = 0 ;
            for(int j = image[0].length-1 ; j >= 0 ; j--){

                new_array[i][a] = image[i][j];
                a = a+1;
            }
        }

        for(int i = 0 ; i < image.length ; i++){
            for(int j = 0 ; j < image[0].length ; j++){
                if(new_array[i][j]==0){
                    new_array[i][j] = 1;
                }
                else{
                    new_array[i][j] = 0;
                }
                
            }
           
        }
        return new_array;
    }
}