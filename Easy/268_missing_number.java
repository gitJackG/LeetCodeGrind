import java.util.HashSet;

class Solution {
    public int missingNumber(int[] nums) {
        int answer = 0;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.size; i++) {
          s.add(nums[i]);
        }
        for (int i = 0; i < nums.size; i++) {
          if (!s.contains(nums[i])) return nums[i];
        }
        return answer;
    }

    public static void main (String[] args) {
      Solution solution = new Solution();
      int[] test = new int[]{3, 0, 1};
      int answer = solution.missingNumber(test);
      System.out.println(answer);
    }
}
