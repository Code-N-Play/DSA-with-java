// 2235. Add Two Integers

// Given two integers num1 and num2, return the sum of the two integers.
 

// Example 1:
// Input: num1 = 12, num2 = 5
// Output: 17
// Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.

// Example 2:
// Input: num1 = -10, num2 = 4
// Output: -6
// Explanation: num1 + num2 = -6, so -6 is returned.



// MY solution for vs code
public class LeetCodeProblemNo2235 {
    public static void main (String[] args) {
        int num1 = 12;
        int num2 = -10;
        int sum = num1 + num2;
        System.out.println(sum);
    }
}

// LeetCode compatible solution
class Solution {
    public int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
