// 867. Transpose Matrix

// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.


// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[1,4,7],[2,5,8],[3,6,9]]

// Example 2:
// Input: matrix = [[1,2,3],[4,5,6]]
// Output: [[1,4],[2,5],[3,6]]

//MY Solution:-
public class LeetCodeProblemNo867{
    public static void main(String[] args){

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int row_count = array.length;
        int column_count = array[0].length;
        int[][] new_array = new int[column_count][row_count];

        for (int i = 0 ; i < row_count ; i++){
            for(int j = 0 ; j < column_count ; j++){
                new_array[j][i] = array[i][j];
            }
        }
        for (int i = 0 ; i < row_count ; i++){ // printing mai out of boundary aa sakta hai jab 2x3 ya 4x5 , 5x4 ki matrix hogi tab
            for(int j = 0 ; j < column_count ; j++){ // iska solution ye hai ki new array ke liye phir se uski row or column count nikal lo 
                System.out.print(new_array[i][j]);
            }
            System.out.println();
        }
    }
}


// LeetCode Compatible Solution:- 
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row_count = matrix.length;
        int column_count = matrix[0].length;
        int[][] new_array = new int[column_count][row_count];

        for (int i = 0 ; i < row_count ; i++){
            for(int j = 0 ; j < column_count ; j++){
                new_array[j][i] = matrix[i][j];
            }
        } 
        return new_array;
    }
}