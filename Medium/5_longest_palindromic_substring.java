class Solution {
    public String longestPalindrome(String s) {
        int n = s.length() - 1;
        int l = 0;
        int r = 0;
        String answer = s.substring(0,1);
        for (int middle = 0; middle <= n; middle++){
            l = 0;
            r = 0;
            while (middle-l >= 0 && middle+r <= n){
                String current = s.substring(middle-l,middle+r+1);
                if (s.charAt(middle-l) == s.charAt(middle+r)){
                    if (current.length() > answer.length()) answer = current; 
                    l++;
                    r++;
                }
                else{
                    break;
                }
            }
            l=0;
            r=0;
            while ((middle-l >= 0 && middle+r+1 <= n) && (s.charAt(middle) == s.charAt(middle+1))){
                if (l == 0 && answer.length() < 2) answer = s.substring(middle,middle+2);
                String current = s.substring(middle-l,middle+r+2);
                if (s.charAt(middle-l) == s.charAt(middle+r+1)){
                    if (current.length() > answer.length()) answer = current; 
                    l++;
                    r++;
                }
                else{
                    break;
                }
            }
        }
        return answer;
    }
}