// 1351. Count Negative Numbers in a Sorted Matrix

// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 
// Example 1:
// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.

// Example 2:
// Input: grid = [[3,2],[1,0]]
// Output: 0

//MY Solution :- 
public class LeetCodeProblemNo1351{
    public static void main (String[] args){
        int[][] array = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int row_count = array.length;
        int column_count = array[0].length;
        int count = 0 ;

        for(int i = 0 ; i < row_count ; i++ ){
            for(int j = 0 ; j < column_count ; j++){
                if (array[i][j] < 0 ){
                    count = count + 1 ;
                }
            }
        }

        System.out.println("Total Number of negative value is : " + count);
        
    }
}


// LeetCode Compatible Solution :- 
class Solution {
    public int countNegatives(int[][] grid) {
        int row_count = grid.length;
        int column_count = grid[0].length;
        int count = 0 ;

        for(int i = 0 ; i < row_count ; i++ ){
            for(int j = 0 ; j < column_count ; j++){
                if (grid[i][j] < 0 ){
                    count = count + 1 ;
                }
            }
        }
        return count;
    }
}
