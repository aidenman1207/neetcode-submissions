class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map <Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int other = target - current;

            if (hs.containsKey(other)) {
                return new int[] {hs.get(other), i};
            } else {
                hs.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
