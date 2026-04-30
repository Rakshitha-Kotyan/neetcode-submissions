class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];

            if (m.containsKey(req)) {
                return new int[]{m.get(req), i};
            }

            m.put(nums[i], i);
        }

        return new int[]{}; 
    }
}