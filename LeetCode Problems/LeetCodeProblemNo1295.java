// 1295. Find Numbers with Even Number of Digits

// Given an array nums of integers, return how many of them contain an even number of digits.

 

// Example 1:
// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.

// Example 2:
// Input: nums = [555,901,482,1771]
// Output: 1 
// Explanation: 
// Only 1771 contains an even number of digits.

// MY solution for vs code
public class LeetCodeProblemNo1295 {
    public static void main (String[] args){
        int[] nums = {12,345,2,6,7896};
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            String str = String.valueOf(nums[i]);
            int len = str.length();

            if (len % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

// LeetCode compatible solution 
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            String str = String.valueOf(nums[i]);
            int len = str.length();

            if (len % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
