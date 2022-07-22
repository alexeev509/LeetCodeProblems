//https://leetcode.com/problems/contains-duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setOfNums = new HashSet();
        for (int i =0; i < nums.length; ++i){
            if(!setOfNums.add(nums[i]))
                return true;
        }
        return false;
    }
}
