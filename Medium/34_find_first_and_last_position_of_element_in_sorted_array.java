class Solution {
  public int[] searchRange(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;
    int[] ans = new int[]{-1, -1};

    while (l <= r){
      int m = l + (r - l) / 2;

      if (nums[m] == target){
        int l1 = m;
        int l2 = m;
        while ((l1 >= 0 && nums[l1] == nums[m]) || (l2 <= nums.length - 1 && nums[l2] == nums[m])){
          if (l1 >= 0 && nums[l1] == nums[m]) l1--;
          if (l2 <= nums.length - 1 && nums[l2] == nums[m]) l2++;
        }
        ans[0] = l1 + 1;
        ans[1] = l2 - 1;
        return ans;
      }
      else if (nums[m] > target){
        r = m - 1;
      }
      else if (nums[m] < target){
        l = m + 1;
      }
    }
    return ans;
  }
}
