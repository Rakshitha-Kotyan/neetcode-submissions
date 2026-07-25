class Solution {
    public boolean isHappy(int n) {
        int ans=n;
        boolean flag=false;
        Set<Integer> s = new HashSet<>();
        while(true){
        ans=squaring(ans);
        if(ans==1){
            flag=true;
            break;
        } else if(s.contains(ans)){
            return false;
        } else {
           s.add(ans);
        }

    }
    return flag;
    }

    public static int squaring(int a){
        int square=0;
        while(a!=0){
            int dig=a%10;
            square+=dig*dig;
            a/=10;
        }
        return square;
    }
}
