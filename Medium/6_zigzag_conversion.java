class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++){
            rows[i] = new ArrayList<>();
        }

        int rowNumber = 0; 
        int direction = 1;
        for (char c : s.toCharArray()){
            rows[rowNumber].add(c);
            if (rowNumber == (numRows - 1)) direction = -1;
            else if (rowNumber == 0) direction = 1;
            rowNumber += direction;
        }

        StringBuffer answer = new StringBuffer();
        for (List<Character> row : rows){
            for (char c : row){
                answer.append(c);
            }
        }

        return answer.toString();
    }
}