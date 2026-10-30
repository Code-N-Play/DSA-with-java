// 231. Power of Two
  
// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.

 

// Example 1:
// Input: n = 1
// Output: true
// Explanation: 20 = 1

// Example 2:
// Input: n = 16
// Output: true
// Explanation: 24 = 16

// Example 3:
// Input: n = 3
// Output: false

// MY Solution for vs code

public class LeetCodeProblemNo231{
    public static void main (String[] args){

        int n = 16;
        boolean bool = false;
        if (n <= 0) {
            bool = false;
        }

        int power = 1;

        while (power < n) {
            power = power * 2;
        }

        if (power == n){
            bool = true;
        }
        System.out.println(bool);
    }
}


// LeetCode compatible solution 
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
