// 1281. Subtract the Product and Sum of Digits of an Integer
  
// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

// Example 1:
// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15
  
// Example 2:
// Input: n = 4421
// Output: 21
// Explanation: 
// Product of digits = 4 * 4 * 2 * 1 = 32 
// Sum of digits = 4 + 4 + 2 + 1 = 11 
// Result = 32 - 11 = 21



// MY Solution for vs code
public class LeetCodeProblemNo1281 {
    public static void main (String args[]) {
        int n = 123;
        String str = String.valueOf(n);
        int len = str.length();
        int sum = 0;
        int mul = 1;
        int ans = 0;

        for(int i = 0; i < len ; i++){
            char val = str.charAt(i);
            int a = val - '0';
            System.out.println(a);
            sum = sum + a;
            mul = mul * a;
            
        }
        ans = mul - sum;
        System.out.println(ans );
    }
}

// Leetcode Compatible solution 
class Solution {
    public int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
        int len = str.length();
        int sum = 0;
        int mul = 1;
        int ans = 0;

        for(int i = 0; i < len ; i++){
            char val = str.charAt(i);
            int a = val - '0';
            sum = sum + a;
            mul = mul * a;
            
        }
        ans = mul - sum;
        return ans;
    }
}
