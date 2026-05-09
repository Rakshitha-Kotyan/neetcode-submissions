class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = max;

        for(int i=1;i<nums.length;i++){
            int cur = nums[i];
            int temp = Math.max(cur, Math.max(cur*min, cur*max));
            min = Math.min(cur, Math.min(cur*max, cur*min));
            max=temp;

            ans= Math.max(ans,max);
           
            }
            return ans;
        }
    }