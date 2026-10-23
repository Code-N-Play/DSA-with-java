// 258. Add Digits
  
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

// Example 1:
// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
  
// Example 2:
// Input: num = 0
// Output: 0



// MY solution for vs code

pulic class LeetCodeProblemNo258 {
    public static void main(String[] args) {
        int num = 199;

        while (num > 9) {
            int count = 0;
            String str = String.valueOf(num);

            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                int digit = a - '0';
                count += digit;
            }

            num = count;
        }

        System.out.println(num);
    }
}


// LeetCode compatible solution 
class Solution {
    public int addDigits(int num) {

        while (num > 9) {
            int count = 0;
            String str = String.valueOf(num);

            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                int digit = a - '0';
                count += digit;
            }

            num = count;
        }

        return num;
    }
}
        
