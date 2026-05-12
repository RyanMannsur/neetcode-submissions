class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stonesFila = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones) {
            stonesFila.add(stone);
        }

        while(stonesFila.size()>1) {
            Integer x = stonesFila.peek();
            stonesFila.poll();

            Integer y = stonesFila.peek();
            stonesFila.poll();

            if (x-y > 0) {
                stonesFila.add(x-y);
            }
        }

        if (stonesFila.size() == 0) return 0;

        return stonesFila.peek();
    }
}
