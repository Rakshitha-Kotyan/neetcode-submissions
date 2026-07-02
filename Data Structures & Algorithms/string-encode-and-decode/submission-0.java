class Solution {

    public String encode(List<String> strs) {
        String en="";
        for(String s:strs){
            en+=s.length()+"#"+s;
        }
        System.out.println(en);
        return en;
    }

    public List<String> decode(String str) {
        List<String> de=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<str.length()){
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            String sub=str.substring(j+1, j+1+len);
            de.add(sub);
            i=j+len+1;
            j=i;

        }

        return de;
    }
}
