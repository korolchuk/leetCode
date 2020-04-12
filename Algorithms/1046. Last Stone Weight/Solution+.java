class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue(stones.length, Collections.reverseOrder());
        
        for(int el : stones) {
            pq.add(el);
        }
        
        while(pq.size() > 1) {
            int tmp = pq.poll() - pq.poll();
            if(tmp != 0) {
                pq.add(tmp);
            }
        }
        
        if(pq.size() != 0) {
            return pq.peek();
        } else {
            return 0;
        }
        
    }
}