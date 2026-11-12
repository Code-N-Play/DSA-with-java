// 34. Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

 
// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
  
// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
  
// Example 3:
// Input: nums = [], target = 0
// Output: [-1,-1]

// my solution for vs code
public class LeetCodeProblemNo34{
    public static void main (String[] args) {

        int[] nums = {4,5,7,8,8,9};
        int target = 8;
        int[] array = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
                array[0] = i;
                array[1] = i;
                for(int j = i+1 ; j < nums.length; j++){
                    if(nums[j]==target){
                        array[1] = j;
                    }
                    else{
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(array[0] + "" + array[1]);
    }
}

// solution for leetcode (but this approach uses O(n) time but question want to solve it in O(logn) time)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] array = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
                array[0] = i;
                array[1] = i;
                for(int j = i+1 ; j < nums.length; j++){
                    if(nums[j]==target){
                        array[1] = j;
                    }
                    else{
                        break;
                    }
                }
                break;
            }
        }
        return array;
    }
}


// Leetcode compatible solution ---> by using binary search approach we can reduce the time from O(n) to O(logn)

class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public int findLast(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
