class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;

        Set<Integer> results = new HashSet<Integer>();

        while(n != 1) {
            if (results.contains(n)) return false;
            results.add(n);

            String nToString = String.valueOf(n);
            n = 0;
            for(int i = 0; i < nToString.length(); i++) {
                int valInteger = Character.getNumericValue(nToString.charAt(i));
                n = n + (valInteger*valInteger);
            }
        }

        return true;
    }
}