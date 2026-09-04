// 344. Reverse String

// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

 
// Example 1:
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

// Example 2:
// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]


//MY Solution:-
public class LeetCodeProblemNo344{
    public static void main(String[] args){

        String[] array = {"h","e","l","l","o"};
        int array_len = array.length;
        int half = Math.round(array_len/2);
        String temp = " ";
        
        for(int i = 0 ; i < half ; i++){
            temp = array[i];
            array[i] = array[(array_len-1)-i];
            array[(array_len-1)-i] = temp ;
        }

        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + " ");
        }
    }
}


// LeetCode compatible code :-

class Solution {
    public void reverseString(char[] s) {
        int array_len = s.length;
        int half = Math.round(array_len/2);
        char temp = ' ';
        
        for(int i = 0 ; i < half ; i++){
            temp = s[i];
            s[i] = s[(array_len-1)-i];
            s[(array_len-1)-i] = temp ;
        }
    }
}