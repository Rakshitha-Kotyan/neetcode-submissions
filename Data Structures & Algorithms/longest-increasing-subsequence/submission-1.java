class Solution {
    public int lengthOfLIS(int[] nums) {

        int ar[] = new int[nums.length+1];
        Arrays.fill(ar,1);
        int max=1;

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    ar[i]=Math.max(ar[i],ar[j]+1);

                    max=Math.max(ar[i],max);
                }
            }
        }
    return max;
        
    }
}
