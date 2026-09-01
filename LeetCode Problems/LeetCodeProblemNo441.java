//441. Arranging Coins

//You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
//Given the integer n, return the number of complete rows of the staircase you will build.

 
//Example 1:
//Input: n = 5
//Output: 2
//Explanation: Because the 3rd row is incomplete, we return 2.

//Example 2:
//Input: n = 8
//Output: 3
//Explanation: Because the 4th row is incomplete, we return 3.


// MY Solution:- 
public class LeetCodeProblemNo441{
  public static void main (String[] args){
    int n = 5;
    int Output = 0;

    for(int i = 1 ; i <= n ; i++){
      if(n >= Ouput){
        Output = 0;
        Output = Output + i;
        n = n-i;
      }
    }
    System.out.println("Number of staircase which is completed " + Output);
  }
}



// LeetCode relevant Solution 
class Solution {
  public int arrangeCoins(int n){

    int A = 0; // Leetcode mai output name reserved hai so koi or name use karo

    for(int i = 1 ; i <= n ; i++){
      if(n >= A){
        A = 0;
        A = A + i;
        n = n-i;
      }
    }
    return A;
  }
}
