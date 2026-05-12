class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        char[] sInVector = s.toCharArray();
        Arrays.sort(sInVector);

        char[] tInVector = t.toCharArray();
        Arrays.sort(tInVector);

        for(int i=0; i<sInVector.length; i++) {
            if (sInVector[i] != tInVector[i]) {
                return false;
            }
        }

        return true;
    }
}
