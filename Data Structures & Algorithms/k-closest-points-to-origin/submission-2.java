class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<int[]> l = new ArrayList<>();
        Map<int[],Double> m = new HashMap<>();

        for(int[] a : points){
            double area=Math.sqrt(Math.pow(a[0],2) + Math.pow(a[1],2));
            m.put(a,area);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)-> Double.compare(m.get(a),m.get(b))
        );

        pq.addAll(m.keySet());

        while(k-->0){
            l.add(pq.poll());
        }

        return l.toArray(new int[l.size()][]);

    }
}
