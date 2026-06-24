class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int postfix=1;
        int prefix=1;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(postfix==0){
                postfix=1;
            }
            if(prefix==0){
                prefix=1;
            }
            
            prefix*=nums[i];
            postfix*=nums[n-i-1];

            max=Math.max(max,Math.max(postfix,prefix));
        }
        return max;
    }
}
