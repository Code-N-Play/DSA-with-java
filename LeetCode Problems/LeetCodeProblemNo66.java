

// MY solution for vs code (but it will not work on too much long number like number that contains 15+ digits)
public class LeetCodeProbleNo66 {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        String curr = "";
        
      for (int i = 0 ; i < digits.length ; i++){
          curr = curr + digits[i];

      }  
    long currint = Long.parseLong(curr);  
    currint = currint + 1;  
      
    String currstr = String.valueOf(currint);  
      
    int[] new_array = new int[currstr.length()];  

    for (int i = 0 ; i < currstr.length() ; i++){  
        new_array[i] = currstr.charAt(i);  
        System.out.println(new_array[i]-48);  
    }  
      
}

}

// Leetcode relevant Solution 
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] new_array = new int[digits.length + 1];

        new_array[0] = 1;

        return new_array;
    }
}
