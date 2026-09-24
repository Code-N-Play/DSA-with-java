
// MY Solution :-
public class LeetCodeProblemNo136 {
    public static void main (String [] args) {
        int[] nums = {4,2,2,1,1};
        int count = 0 ;
        int ele = 0;
        for(int i = 0 ; i < nums.length ; i++){
            ele = nums[i];
            count = 0;
            for (int j = 0; j< nums.length ; j++ ){
                if (ele == nums[j]){
                    count++;
                }
                
            }
            if (count == 1){
                break;
            }
        }
        System.out.println("The Single element is :" + ele);
    }
}

// LeetCode compatible Solution:- 
class Solution {
    public int singleNumber(int[] nums) {
        int count = 0 ;
        int ele = 0;
        for(int i = 0 ; i < nums.length ; i++){
            ele = nums[i];
            count = 0;
            for (int j = 0; j< nums.length ; j++ ){
                if (ele == nums[j]){
                    count++;
                }
                
            }
            if (count == 1){
                break;
            }
        }
        return ele;
    }
}
