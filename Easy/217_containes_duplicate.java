class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();
        for (int num : nums){
            if (duplicates.contains(num)) return true;
            else duplicates.add(num);
        }
        return false;
    }
}
