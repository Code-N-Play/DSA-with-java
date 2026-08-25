// 217. Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 
// Example 1:
// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.

// Example 2:
// Input: nums = [1,2,3,4]
// Output: false
// Explanation:
// All elements are distinct.

// MY Slution :-      time complexity maybe :- O(n^2)

public class LeetCodeProblemNo217{
    public static void main (String[] args){

        int[] array = {1,2,3,1};
        int array_len = array.length;
        int count = 0 ;
        boolean haveduplicate = false ; 

        for(int i = 0 ; i < array_len ; i++){
            int ele = array[i];
            count = 0 ; 
            for(int j = 0 ; j < array_len ; j++){
                if (ele == array[j]){
                    count = count + 1;
                    if(count > 1){
                        haveduplicate = true;
                        break ;
                    }
                }
            }
        }

        if(haveduplicate){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}



// LeetCode compatible code :-

class Solution {
    public boolean containsDuplicate(int[] nums) {

        int array_len = nums.length;
        int count = 0;

        for (int i = 0; i < array_len; i++) {

            int ele = nums[i];
            count = 0;

            for (int j = 0; j < array_len; j++) {

                if (ele == nums[j]) {
                    count++;

                    if (count > 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

