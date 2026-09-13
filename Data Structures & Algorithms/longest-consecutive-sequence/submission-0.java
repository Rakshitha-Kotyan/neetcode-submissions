class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> s = new HashSet<>();

        for(int i:nums){
            s.add(i);
        }
        int ans=0;
        
        for(int i:s){
            int count=0;
            if(!s.contains(i-1)){
                count=count+1;
                int cur=i+1;
                while(s.contains(cur)){
                    count++;
                    cur=cur+1;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;    
    }
}
