import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();

    if (digits.length() == 0) return result;

    Map<Character, String> mapping = new HashMap<>();
    mapping.put('2',"abc");
    mapping.put('3',"def");
    mapping.put('4',"ghi");
    mapping.put('5',"jkl");
    mapping.put('6',"mno");
    mapping.put('7',"pqrs");
    mapping.put('8',"tuv");
    mapping.put('9',"wxyz");

    backtrack(digits, 0, new StringBuilder(), result, mapping);

    return result;
  }

  private static void backtrack(String digits, int position, StringBuilder sb, List<String> result, Map<Character, String> mapping) {
   if (position == digits.length()) { 
     result.add(sb.toString());
     return;
   } 

   String next_digits = mapping.get(digits.charAt(position));
   for (char c : next_digits.toCharArray()) {
     sb.append(c);
     backtrack(digits, position + 1, sb, result, mapping);
     sb.deleteCharAt(sb.length() - 1);
   }
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    String digits = "23";
    List<String> answer = solution.letterCombinations(digits);
    for (int i = 0; i < answer.size(); ++i) {
     System.out.println(answer.get(i)); 
    }
  }
}
