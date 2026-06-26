class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> s = new HashSet<>();
        int maxLen=0;
        for(int n:nums){
            s.add(n);
        }

        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            if(!s.contains(cur-1)){
                int len=1;
                while(s.contains(cur+1)){
                    len++;
                    cur++;
                }
                maxLen=Math.max(len,maxLen);
            }
        }
       return maxLen; 
    }
}
