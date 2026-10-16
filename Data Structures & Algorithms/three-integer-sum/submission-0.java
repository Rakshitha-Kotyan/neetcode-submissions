class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            left=i+1;
            right=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            while(left<right){
                int ans=nums[left]+nums[right]+nums[i];
                if(ans<0){
                    left++;
                } else if(ans>0){
                    right--;
                }else {
                    l.add(new ArrayList(Arrays.asList(nums[left],nums[right],nums[i])));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1] ){
                        left++;
                    }
                }
            }

        }
        return l;
    }
}
