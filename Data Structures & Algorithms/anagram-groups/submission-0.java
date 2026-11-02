class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String sorted = new String(array);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }

        for (String key : map.keySet()) {
            list.add(map.get(key));
        }

        return list;
        
    }
}
