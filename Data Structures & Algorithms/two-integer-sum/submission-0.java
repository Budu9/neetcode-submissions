class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> leftoverIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (leftoverIndex.get(nums[i]) != null) return new int[] {leftoverIndex.get(nums[i]), i};

            leftoverIndex.put(target-nums[i], i);
        }

        return null;
    }
}
