class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
      

        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->m.get(b)-m.get(a)
        );

        pq.addAll(m.keySet());

        System.out.println(pq);
        int ans[] = new int[k];
        int i=0;
        while(k-->0){
            ans[i++]=pq.poll();
        }
        return ans;
        
    }
}
