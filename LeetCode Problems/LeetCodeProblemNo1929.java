// 1929. Concatenation of Array

// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
// Specifically, ans is the concatenation of two nums arrays.
// Return the array ans.

 
// Example 1:
// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]
    
// Example 2:
// Input: nums = [1,3,2,1]
// Output: [1,3,2,1,1,3,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
// - ans = [1,3,2,1,1,3,2,1]

// Solution:-

public class LeetCodeProblemNo1929 {
    public static void main(String[] args) {
        int[] array = {1,2,1};
        int array_len = array.length;
        int[] new_array = new int[array_len*2];
        int A = 0;


        for(int i = 0; i<new_array.length ; i++){
            if (i % array_len == 0){
                A=0;
            }
            new_array[i] = array[A];
            A=A+1;
        }


        System.out.println("Concatinated Array ....");

        for(int i=0; i<new_array.length ; i++){
            System.out.print(new_array[i] + ", ");
        }
    }
}
