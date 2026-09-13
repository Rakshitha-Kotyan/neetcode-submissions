class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n=s.length();
        int l=0;
        int maxlen=0;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            while(l<n && set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
