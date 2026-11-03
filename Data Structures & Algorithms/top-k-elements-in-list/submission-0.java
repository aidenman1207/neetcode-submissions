class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for (int i : nums) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        Set<Integer> set = new TreeSet<>(map.keySet());

        for (int i = 0; i < k; i++) {
            int max = 0;
            int maxKey = 0;
            for (Integer key : set) {
                if (map.get(key) >= max) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            set.remove(maxKey);

            result[i] = maxKey;
        }
        return result;
    }
}
