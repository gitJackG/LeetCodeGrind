class Solution {
    public int myAtoi(String s) {
        long answer = 0;
        int negative = 1;
        boolean started = false;
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)){
                int digit = c - '0';
                answer = answer * 10 + digit;
                if (Integer.MAX_VALUE <= answer * negative) return Integer.MAX_VALUE;
                if (Integer.MIN_VALUE >= answer * negative) return Integer.MIN_VALUE;
                started = true;
            }
            else if (started) break;
            else if (c == ' ') continue;
            else if (c == '-') {
                negative = -1;
                started = true;
            }
            else if (c == '+') {
                negative = 1;
                started = true;
            }
            else{
                break;
            }
            
        }
        return (int)answer*negative;
    }
}