class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> positionTargetMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int need = target - nums[i];
            Integer positionTarget = positionTargetMap.get(nums[i]);

            if (positionTarget != null) {
                return new int[]{positionTarget, i};
            } else {
                positionTargetMap.put(need, i);
            }
        }

        return new int[]{};
    }
}
