// 242. Valid Anagram

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:
// Input: s = "rat", t = "car"
// Output: false


// my solution for vs code 
public class LeetCodeProblemNo242 {
    public static void main (String[] args) {

        String s = "anagram";
        String t = "nagaram";
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        boolean result = true;

        for(int i = 0 ; i < s.length() ; i++){
            array1[s.charAt(i)-'a']++;
        }
        for(int i = 0 ; i < t.length() ; i++){
            array2[t.charAt(i)-'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(array1[i] != array2[i]){
                result = false;
                break;
            }
            
        }
        System.out.println(result);
    }
}


// leetcode compatible solution 
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        boolean result = true;

        for(int i = 0 ; i < s.length() ; i++){
            array1[s.charAt(i)-'a']++;
        }
        for(int i = 0 ; i < t.length() ; i++){
            array2[t.charAt(i)-'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(array1[i] != array2[i]){
                result = false;
                break;
            }
            
        }
        return result;
    }
}
