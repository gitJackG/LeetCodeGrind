class Solution {
    public String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; ++i) {
            if (num == 0) break;
            while (num >= values[i]){
                answer.append(symbols[i]);
                num -= values[i];
            }
        }

        return answer.toString();
    }
}
