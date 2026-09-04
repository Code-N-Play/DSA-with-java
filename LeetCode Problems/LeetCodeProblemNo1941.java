// 1941. Check if All Characters Have Equal Number of Occurrences

// A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).


// Example 1:
// Input: s = "abacbc"
// Output: true
// Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

// Example 2:
// Input: s = "aaabb"
// Output: false
// Explanation: The characters that appear in s are 'a' and 'b'.
// 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.


//MY Solution :- 
public class LeetCodeProblemNo1941{
    public static void main (String[] args){

        String A = "lolopupu";
        int A_len = A.length();
        int[] array = new int[26];
        boolean B = false;

        for(int i = 0 ; i < A_len ; i++){
            array[A.charAt(i)-'a']++;
        }
        int count = array[A.charAt(0)-'a'];
        for(int i = 0 ; i < 26 ; i++){
            if(array[i] == 0 || array[i] == count){
                B = true;
            }
            else{
                B = false;
                break;
            }
        }
        System.out.println(B);
    }
}


// LeetCode compatible code :-

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int s_len = s.length();
        int[] array = new int[26];
        boolean B = false;

        for(int i = 0 ; i < s_len ; i++){
            array[s.charAt(i)-'a']++;
        }
        int count = array[s.charAt(0)-'a'];
        for(int i = 0 ; i < 26 ; i++){
            if(array[i] == 0 || array[i] == count){
                B = true;
            }
            else{
                B = false;
                break;
            }
        }
        return B;
    }
}