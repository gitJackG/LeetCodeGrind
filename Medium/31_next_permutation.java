class Solution {
  public void nextPermutation(int[] nums) {
    int n = nums.length;
    int pivot = 0;

    for (int i = n-1; i > 0; i--){
      if (nums[i-1] < nums[i]){
        pivot = i;
        break;
      }
    }

    if (pivot == 0){
      Arrays.sort(nums);
      return;
    }

    int swap = n-1;
    while (nums[pivot-1] >= nums[swap]){
      swap--;
    }

    int temp = nums[swap];
    nums[swap] = nums[pivot-1];
    nums[pivot-1] = temp;

    int l = pivot;
    int r = n-1;

    while (l <= r)
    {
      temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
      l++;
      r--;
    }
  }
}
