class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            n=squaring(n);
            
        }
    return n==1;
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
