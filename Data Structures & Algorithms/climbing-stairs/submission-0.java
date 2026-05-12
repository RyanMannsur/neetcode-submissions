class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> countClimb = new HashMap<>();
        int qntd = 1;

        if (n == 1) {
            return 1;
        }

        int qndAnt = 1;
        int addAnt = 1;

        for (int i=2; i <= n; i++) {
            int aux = qntd;
            qntd = qndAnt + addAnt;
            addAnt = aux; 
            qndAnt = qntd;
        }

        return qntd;
    }
}