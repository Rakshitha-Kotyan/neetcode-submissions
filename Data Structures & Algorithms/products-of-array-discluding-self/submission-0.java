class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int prefix=1;
        int postfix=1;
        int ans[] = new int[nums.length];
        for(int i=0;i<n;i++){
            ans[i]=prefix;
            prefix*=nums[i];
        }

        for(int i=n-1;i>=0;i--){
            ans[i]*=postfix;
            postfix*=nums[i];
        }
        
        return ans;

    }
}  
