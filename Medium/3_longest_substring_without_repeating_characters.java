import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int j = 0;

        HashSet<Character> visited = new HashSet<>();

        for (int i = 0; i < s.length(); i++){
            while (visited.contains(s.charAt(i))){
                visited.remove(s.charAt(j));
                j++;
            }
            visited.add(s.charAt(i));
            if (visited.size() > maxLength) maxLength = visited.size();
        }
        return maxLength;
    }
}