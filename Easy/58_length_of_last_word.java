class Solution {
    public int lengthOfLastWord(String s) {
        boolean start = false;
        int current = 0;
        int last = current;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ') {
                if(start){
                    start = false;
                    last = current;
                }
                current = 0;
            }
            else{
                start = true;
                current++;
            }
        }
        return start ? current : last;
    }
}