// 58. Length of Last Word

// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

 
// Example 1:
// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

// Example 2:
// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.

// Example 3:
// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.


// MY Solution :- 
public class LeetCodeProblemNo58 {
    public static void main (String[] args) {

        String s = "Hello world "
        String a = s.trim();
        int len = a.length();
        int last_len = 0;

        for(int i = 0; i < len ; i++){
            if(a.charAt(i) == ' '){
                last_len = 0;
            }
            else{
                last_len++;
            }
        }
        System.out.println("Last word length is : " + last_len);
    }
}

// Leetcode compatible solution :- 
class Solution {
    public int lengthOfLastWord(String s) {

        String a = s.trim();
        int len = a.length();
        int last_len = 0;

        for(int i = 0; i < len ; i++){
            if(a.charAt(i) == ' '){
                last_len = 0;
            }
            else{
                last_len++;
            }
        }
        return last_len;
    }
}
