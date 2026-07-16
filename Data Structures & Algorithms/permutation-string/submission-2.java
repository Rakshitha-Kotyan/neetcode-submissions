class Solution {
    public boolean checkInclusion(String s1, String s2) {
         
         if(s2.length()<s1.length()){
            return false;
         }

         int s1freq[] = new int[26];
         int s2freq[] = new int[26];

         for(int i=0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
            s2freq[s2.charAt(i)-'a']++;
         }

         for(int i=0;i<s2.length()-s1.length();i++){
            if(matches(s1freq,s2freq)){
                return true;
            }
            s2freq[s2.charAt(i+s1.length())-'a']++;
            s2freq[s2.charAt(i)-'a']--;
         }
    return matches(s1freq,s2freq);
    }


    public boolean matches(int a[], int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
