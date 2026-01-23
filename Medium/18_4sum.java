import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    
    for (int i = 0; i < nums.length; ++i) {
      if ((i - 1 >= 0) && (nums[i] == nums[i-1])) continue;
      for (int j = i + 1; j < nums.length; ++j) {
        if ((j - 1 != i) && (nums[j] == nums[j-1])) continue;
        int left = j + 1;
        int right = nums.length - 1;
        while (left < right) {
          long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
          if (sum > target) --right;
          else if (sum < target) ++left;
          else {
            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
            while ((left < right) && (nums[left] == nums[left + 1])) ++left;
            while ((left < right) && (nums[right] == nums[right - 1])) --right;
            ++left;
            --right;
          }
        }
      }        
    }

    return result;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    List<List<Integer>> answer = solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0 );
    for (int i = 0; i < answer.size(); ++i) {
      for (int j = 0; j < answer.get(i).size(); ++j) {
        System.out.print(answer.get(i).get(j));
      }
      System.out.println();
    }
  }
}
