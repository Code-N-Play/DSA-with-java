// 66. Plus One
    
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.

 

// Example 1:
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// Example 2:
// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].

//Example 3:
// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].


// MY solution for vs code (but it will not work on too much long number like number that contains 15+ digits)
public class LeetCodeProbleNo66 {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        String curr = "";
        
      for (int i = 0 ; i < digits.length ; i++){
          curr = curr + digits[i];

      }  
    long currint = Long.parseLong(curr);  
    currint = currint + 1;  
      
    String currstr = String.valueOf(currint);  
      
    int[] new_array = new int[currstr.length()];  

    for (int i = 0 ; i < currstr.length() ; i++){  
        new_array[i] = currstr.charAt(i);  
        System.out.println(new_array[i]-48);  
    }  
      
}

}

// Leetcode relevant Solution 
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] new_array = new int[digits.length + 1];

        new_array[0] = 1;

        return new_array;
    }
}
