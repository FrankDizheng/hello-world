/**
 * Created by Frank on 3/21/2016.
 */
public class Solution {
    public boolean search(int[] nums,int target) {
        int first = 0, last = nums.length;
        while(first != last){
            int mid = (first + last)/2;
            if(nums[mid] == target)
                return true;
            if(nums[first] < nums[mid]){
                if(nums[first] <= target && target < nums[mid])
                    last = mid;
                else
                    first = mid + 1;
            }else if(nums[first] > nums[mid]){
                if(nums[mid] <= target && target < nums[last -1])
                    first = mid + 1;
                else
                    last = mid;
            }else
                first++;
        }
        return false;
    }
}
