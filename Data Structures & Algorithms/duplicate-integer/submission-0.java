class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}