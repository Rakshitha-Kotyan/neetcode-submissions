class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right= 0;
        char ch[] = s.toCharArray();
        int length=0;
        if(s == null || s.length()==0){
            return 0;
        }
        
        if(s.length() == 1){
            return 1;
        }
        Set<Character> set = new HashSet<>();


        while(right<ch.length){
            while(set.contains(ch[right])){
                set.remove(ch[left]);
                left++;
            }
            set.add(ch[right]);
            length=Math.max(length,right-left+1);
            right++;
            }
               return length;   
        }
       
    }
