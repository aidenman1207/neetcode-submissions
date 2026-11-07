class Solution {

    public String encode(List<String> strs) {
        String code = "";
        for (String s : strs) {
            code += "" + s.length() + "#" + s;
        }
        return code;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int num = Integer.parseInt(str.substring(i, j));
            list.add(str.substring(j+1, j+1+num));
            i = j+1+num;
        }

        return list;
    }
}
