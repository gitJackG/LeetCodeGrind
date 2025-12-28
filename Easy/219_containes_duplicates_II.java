class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> duplicates = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!duplicates.containsKey(nums[i])) duplicates.put(nums[i],i);
            else{
                int previous_index = duplicates.get(nums[i]);
                if (previous_index != i && Math.abs(previous_index-i) <= k) return true;
                else duplicates.put(nums[i],i);
            }
        }
        return false;
    }
}
