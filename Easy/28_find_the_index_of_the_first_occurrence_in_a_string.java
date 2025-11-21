class Solution {
    public int strStr(String haystack, String needle) {
        boolean found = false;
        for (int i = 0; i < haystack.length(); i++){
            if (haystack.length() - i >= needle.length()){
                for (int j = 0; j < needle.length(); j++){
                    if (haystack.charAt(i+j) != needle.charAt(j)){
                        found = false;
                        break;
                    }
                    else found = true;
                }
            }
            if (found) return i;
        }
        return -1;
    }
}