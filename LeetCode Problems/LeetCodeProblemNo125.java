// 125. Valid Palindrome

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 
// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

// Example 3:
// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.


//MY Solution:- 
public class LeetCodeProblemNo125{
    public static void main (String[] args){
        String s = "A man, a plan, a canal: Panama";
        int s_len = s.length();
        String finalstr = "";
        String revstr = "";

        for(int i = 0 ; i < s_len ; i++){
            char character = s.charAt(i);
            if(Character.isLetterOrDigit(character)){
                finalstr = finalstr + character;
            }
        }
        for(int i = finalstr.length()-1 ; i >= 0; i--){
            revstr = revstr + finalstr.charAt(i);
        }
        if(finalstr.toLowerCase().equals(revstr.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
           System.out.println("Not a Palindrome");
        }

    }
}


// LeetCode compatible code :-

class Solution {
    public boolean isPalindrome(String s) {
        int s_len = s.length();
        String finalstr = "";
        String revstr = "";
        boolean ans = false ;

        for(int i = 0 ; i < s_len ; i++){
            char character = s.charAt(i);
            if(Character.isLetterOrDigit(character)){
                finalstr = finalstr + character;
            }
        }
        for(int i = finalstr.length()-1 ; i >= 0; i--){
            revstr = revstr + finalstr.charAt(i);
        }
        if(finalstr.toLowerCase().equals(revstr.toLowerCase())){
            ans = true;
        }
        else{
            ans = false;
        }

        return ans;
    }
}