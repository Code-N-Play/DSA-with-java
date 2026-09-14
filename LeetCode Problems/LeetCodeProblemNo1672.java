// 1672. Richest Customer Wealth

// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.


// Example 1:
// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.

// Example 2:
// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.

// Example 3:
// Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
// Output: 17
 

// MY Solution:-
public class LeetCodeProblemNo1672{
  public static void main (String [] args){

    int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
    int row_count = array.length;
    int column_count = array[0].length;
    int max = 0;
    int wealth= 0;

    for(int i = 0 ; i < row_count ; i++){
      wealth = 0;
      for(int j = 0 ; j < column ; j++){
        wealth = wealth + array[i][j];
      }
      if (max < wealth){
        max = wealth;
      }
    }

    System.out.println("The maximum wealth is : " + max);
  }
}


// Leetcode compatible solution :- 
class Solution {
    public int maximumWealth(int[][] accounts) {
        int row_count = accounts.length;
        int column_count = accounts [0].length;
        int max = 0;
        int wealth= 0;

        for(int i = 0 ; i < row_count ; i++){
            wealth = 0;
            for(int j = 0 ; j < column_count ; j++){
                wealth = wealth + accounts[i][j];
            }
            if (max < wealth){
                max = wealth;
            }
        }
        return max;
    }
}
