class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsLidos = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            boolean isNotExists = numsLidos.add(nums[i]);
            if (!isNotExists) {
                return true;
            }
        }
        return false; 
    }
}