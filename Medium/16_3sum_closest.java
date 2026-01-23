import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int answer = Integer.MAX_VALUE;
       Arrays.sort(nums);
       for (int i = 0; i < nums.length; i++) {
         int j = i + 1;
         int k = nums.length - 1;
         while (j < k) {
           int sum = nums[i] + nums[j] + nums[k];
           if (Math.abs(target - sum) < Math.abs(target - answer)) answer = sum;
           if (sum < target) ++j;
           else if (sum > target) --k;
           else return sum; 
         }
       }
       return answer;
    }

    public static void main(String[] args) {
      Solution solution = new Solution();
      int[] nums = new int[]{0, 0, 0};
      int target = 1;
      int test = solution.threeSumClosest(nums, target);
      System.out.println(test);
    }

}
