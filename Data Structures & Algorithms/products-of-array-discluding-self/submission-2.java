class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix=1;
        int postfix=1;
        int prodArr[] = new int[nums.length];

        for(int i=0;i<n;i++){
            prodArr[i]=prefix;
            prefix*=nums[i];
        }

        for(int j=n-1;j>=0;j--){
            prodArr[j]*=postfix;
            postfix*=nums[j];
        }

        return prodArr;

    }
}  
