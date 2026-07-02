class Solution {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            m.put(numbers[i],i+1);
        }
        System.out.println(m);
        int ans[]=new int[2];
        for(int i=0;i<numbers.length;i++){
            int num=target-numbers[i];
            if(m.containsKey(num)){
                ans[1]=i+1;
                ans[0]=m.get(num);             
            }
        }
        return ans;
        
    }
}
