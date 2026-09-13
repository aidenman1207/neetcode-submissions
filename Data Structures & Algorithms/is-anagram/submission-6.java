class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map <Character, Integer> sh = new HashMap <>();
        Map <Character, Integer> th = new HashMap <>();

        for (int i = 0; i < s.length(); i++) {
            sh.put(s.charAt(i), sh.getOrDefault(s.charAt(i), 0) + 1);
            th.put(t.charAt(i), th.getOrDefault(t.charAt(i), 0) + 1);
        }

        List <Character> list1 = new ArrayList <>(sh.keySet());
        List <Character> list2 = new ArrayList <>(th.keySet());

        if (list1.size() != list2.size()){
            return false;
        }

        for (int i = 0; i < list1.size(); i++){
            int count = 0;
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(i) == list2.get(j)){
                    count++;
                } 
            }
            if (count == 0){
                return false;
            }
        }

        for (Character key : sh.keySet()) {
            if (!sh.get(key).equals(th.get(key))) {
                return false;
            }
        }
        return true;
    }
}
