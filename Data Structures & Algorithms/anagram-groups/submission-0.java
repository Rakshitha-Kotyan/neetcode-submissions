class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();
        int freq[] = new int[26];
        for(String s:strs){
            Arrays.fill(freq,0);
            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }
            String key=Arrays.toString(freq);
            m.putIfAbsent(key,new ArrayList<>());
            m.get(key).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
