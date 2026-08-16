class Solution {
    public int characterReplacement(String s, int k) {
        int maxF=0;
        int res=0;
        Map<Character, Integer> m = new HashMap<>();

        int left=0;
        for(int right=0;right<s.length();right++){
            m.put(s.charAt(right), m.getOrDefault(s.charAt(right),0)+1);
            maxF=Math.max(maxF, m.get(s.charAt(right)));

            while((right-left+1)-maxF > k){
                m.put(s.charAt(left), m.get(s.charAt(left))-1);
                left++;
                
            }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}
