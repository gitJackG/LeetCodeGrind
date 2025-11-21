class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        char current;
        for (int i = 0; i < strs[0].length(); i++){
            current = strs[0].charAt(i);
            for (String str : strs) {
                if (str.length() == i || str.charAt(i) != current) {
                    return common;
                }
            }
            common += strs[0].charAt(i);
        }
        return common;
    }
}