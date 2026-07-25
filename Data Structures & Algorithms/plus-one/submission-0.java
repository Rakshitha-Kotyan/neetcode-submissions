class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        if(digits[n-1]<9){
                digits[n-1]+=1;
                return digits;
        }
        int carry=0;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            } else {
                carry=1;
                digits[i]=0;
            }
        }
        int ans[]= new int[digits.length+1];
        if(carry==1){
            ans[0]=1;
            for(int i=1;i<ans.length;i++){
                ans[i]=digits[i-1];
            }
        }
        return ans;
    }
}
