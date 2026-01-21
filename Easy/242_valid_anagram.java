class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (m.get(s.charAt(i)) == null)
                m.put(s.charAt(i), 1);
            else {
                int count = 1 + m.get(s.charAt(i));
                m.put(s.charAt(i), count);
            }
            if (m2.get(t.charAt(i)) == null)
                m2.put(t.charAt(i), 1);
            else {
                int count2 = 1 + m2.get(t.charAt(i));
                m2.put(t.charAt(i), count2);
            }
        }

        return m.equals(m2);
    }
}
