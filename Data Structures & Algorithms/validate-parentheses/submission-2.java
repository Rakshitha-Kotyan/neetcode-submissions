class Solution {
    public boolean isValid(String s) {

        if(s==null || s.length() == 1){
            return false;
        }
        Map<Character, Character> m = new HashMap<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');

        Stack<Character> st = new Stack();

        for(Character ch: s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            } else {
                if(st.isEmpty()){
                    return false;
                }
                char temp = st.pop();
                if(temp!=m.get(ch)){
                    return false;
                }
            }

        }

        return st.isEmpty();
    }
}
