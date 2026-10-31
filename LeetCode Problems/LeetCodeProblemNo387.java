// 387. First Unique Character in a String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

// Example 1:
// Input: s = "leetcode"
// Output: 0
// Explanation:
// The character 'l' at index 0 is the first character that does not occur at any other index.

// Example 2:
// Input: s = "loveleetcode"
// Output: 2

// Example 3:
// Input: s = "aabb"
// Output: -1



// MY Solution for VS code
punlic class LeetCodeProbpemNo387 {
    public static void main (String[] args) {
        String s = "leetcode";
        int len = s.length();
        int count = 0;
        int A = -1;
        for(int i = 0 ; i < len ; i++){
            count = 0;
            for(int j = 0 ; j < len ; j++)
            {
                if (j != i){
                    if(s.charAt(i) == (s.charAt(j))){
                        count++;
                    }
                }
            }  
            if(count == 0){
                A = i;
                break;
            }
        }
        System.out.println(A);
    }
}

// LeetCode compatible Solution
class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
