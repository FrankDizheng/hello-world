/**
 * Created by Frank on 3/21/2016.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;

        int index = 0;
        int occur = 1;
        for(int i=1; i<nums.length;i++){
            if(nums[index] == nums[i]) {
                if (occur < 2) {
                    nums[++index] = nums[i];
                    occur++;
                }
            } else{
                nums[++index] = nums[i];
                occur = 1;
            }
        }
        return index + 1;
    }
}
