class Solution {
    public int rob(int[] nums) {
        int r1=0;
        int r2=0;
        int max=0;

        for(int i=0;i<nums.length;i++){

            max=Math.max(r1+nums[i],r2);
            r1=r2;
            r2=max;
        
        }
      return max;
    }
}
