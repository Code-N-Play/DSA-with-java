// 283. Move Zeroes

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

 
// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Example 2:
// Input: nums = [0]
// Output: [0]


// MY solution for vs code:- 

public class LeetCodeProblemNo283{
    public static void main (String[] args){

        int[] array = {0,0,1};
        int array_len = array.length;
        int temp = 0 ;

        for(int k = 0 ; k < array_len ; k++){
            for(int i = 0 ; i < array_len  ; i++){
                if (array[i] == 0){
                    temp = array[i];
                    for(int j= i ; j < array_len-1 ; j++){
                        array[j] = array[j+1];
                    }
                    array[array_len - 1] = temp;
                }
            }
        }

        System.out.println("After Array sorting");
        for(int i = 0 ; i < array_len ; i ++){
            System.out.print(array[i] + ", ");
        }
    }
}


// leetcode compatible solution
class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            
            for( int j = 0 ; j < nums.length-1 ; j++){
                if(nums[j] ==0){
                temp = nums[j];
                nums[j] = nums[j+1];
                nums [j+1] = temp;
                }
            }
            
            System.out.println(nums[i]);
        }
        
    }
}
