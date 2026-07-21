class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";
        Map<Character,Integer> T = new HashMap<>(); 
        for(char c:t.toCharArray()){
            T.put(c, T.getOrDefault(c,0)+1);
        }
        int resLen=Integer.MAX_VALUE;
        int resWind[] = {-1,-1};
        int need=T.size();
        int have=0;
        int left=0;
        Map<Character,Integer> S = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            S.put(c, S.getOrDefault(c,0)+1);
            if(T.containsKey(c) && S.get(c).equals(T.get(c))){
                have++;
            }

            while(have==need){
                if((right-left+1)<resLen){
                resLen=(right-left+1);
                resWind[0]=left;
                resWind[1]=right;
                }
                char leftchar=s.charAt(left);
                S.put(leftchar,S.get(leftchar)-1);
                if(T.containsKey(leftchar) && S.get(leftchar) < T.get(leftchar) ){
                    have--;
                }
                left++;
            } 
        }

    return resLen == Integer.MAX_VALUE ? "" :s.substring(resWind[0],resWind[1]+1);
    }
}
