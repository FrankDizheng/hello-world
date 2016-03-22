/**
 * Created by Frank on 3/21/2016.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int index = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[index] != nums[i])
                nums[++index] = nums[i];
        }
        return index + 1;
    }
}
