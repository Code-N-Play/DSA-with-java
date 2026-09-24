// 136. Single Number

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:
// Input: nums = [2,2,1]
// Output: 1
    
// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4
    
// Example 3:
// Input: nums = [1]
// Output: 1

 

// MY Solution :-
public class LeetCodeProblemNo136 {
    public static void main (String [] args) {
        int[] nums = {4,2,2,1,1};
        int count = 0 ;
        int ele = 0;
        for(int i = 0 ; i < nums.length ; i++){
            ele = nums[i];
            count = 0;
            for (int j = 0; j< nums.length ; j++ ){
                if (ele == nums[j]){
                    count++;
                }
                
            }
            if (count == 1){
                break;
            }
        }
        System.out.println("The Single element is :" + ele);
    }
}

// LeetCode compatible Solution:- 
class Solution {
    public int singleNumber(int[] nums) {
        int count = 0 ;
        int ele = 0;
        for(int i = 0 ; i < nums.length ; i++){
            ele = nums[i];
            count = 0;
            for (int j = 0; j< nums.length ; j++ ){
                if (ele == nums[j]){
                    count++;
                }
                
            }
            if (count == 1){
                break;
            }
        }
        return ele;
    }
}
