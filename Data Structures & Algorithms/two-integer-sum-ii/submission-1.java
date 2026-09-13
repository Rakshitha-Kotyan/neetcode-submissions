class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int res[] = new int[2];
        while(i<j){
            int ans=nums[i]+nums[j];
            if(ans>target){
                j--;
            } else if(ans<target){
                i++;
            } else {
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
        }
        return res;

    }
}
