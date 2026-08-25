// 189. Rotate Array

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.


// Example 1:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

// Example 2:
// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]


// MY Solution :- 

public class LeetCodeProblemNo189{
    public static void main (String[] args){

        int[] array = {1,2,3,4,5,6,7};
        int array_len = array.length;
        int k = 3 ; 
        int temp = 0 ;
        int a = 0 ;
        int half = Math.round(array_len/2);

        for(int  i= 0 ; i < half ; i++ ){
            temp = array[i];
            array[i] = array[(array_len-1)-i];
            array[(array_len-1)-i] = temp ;
        }

        int k_half = Math.round(k/2);

        for(int i = 0 ; i < k_half ; i++){
            temp = array[i];
            array[i] = array[(k-1)-i];
            array[(k-1)-i] = temp ;
        }

        int rest = array_len - k ;
        int rest_half = Math.round(rest/2);

        for(int i = k ; i < k+rest_half ; i++){
            temp = array[i];
            array[i] = array[(array_len-1)-a];
            array[(array_len-1)-a] = temp;
            a=a+1;
        }

        System.out.println("Final Array " + half);
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
    }
}

// LeetCode compatible code :- but time Limit Exceeded

class Solution {
    public void rotate(int[] nums, int k) {
     
        int temp = 0 ;
        int a = 0 ;
        k = k % nums.length;
        int half = Math.round(nums.length/2);

        for(int  i= 0 ; i < half ; i++ ){
            temp = nums[i];
            nums[i] = nums[(nums.length-1)-i];
            nums[(nums.length-1)-i] = temp ;
        }

        int k_half = Math.round(k/2);

        for(int i = 0 ; i < k_half ; i++){
            temp = nums[i];
            nums[i] = nums[(k-1)-i];
            nums[(k-1)-i] = temp ;
        }

        int rest = nums.length - k ;
        int rest_half = Math.round(rest/2);

        for(int i = k ; i < k+rest_half ; i++){
            temp = nums[i];
            nums[i] = nums[(nums.length-1)-a];
            nums[(nums.length-1)-a] = temp;
            a=a+1;
        }

        System.out.println("Final Array " + half);
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + ", ");
        }
    }
}


// LeetCode compatible code :- Without Error

class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        // Reverse entire array
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }

        // Reverse first k elements
        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = temp;
        }

        // Reverse remaining elements
        for (int i = k; i < k + (n - k) / 2; i++) {
            int j = n - 1 - (i - k);

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
