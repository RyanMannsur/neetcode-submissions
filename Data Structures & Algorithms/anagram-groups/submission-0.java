class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<String> strList = Arrays.asList(strs);
        Set<Integer> anagramSet = new HashSet<>();

        List<List<String>> output = new ArrayList<>();
        for (int i=0; i<strList.size(); i++) {

            List<String> anagramList = new ArrayList<>();
            
            if(anagramSet.contains(i)) {
                continue;
            }
            anagramList.add(strList.get(i));

            for (int j=i+1; j<strList.size(); j++) {

                String s = strList.get(i);
                String t = strList.get(j);
                if (s.length() != t.length()) {
                    continue;
                }

                char[] sInVector = s.toCharArray();
                Arrays.sort(sInVector);
                String sortedS = String.valueOf(sInVector);

                char[] tInVector = t.toCharArray();
                Arrays.sort(tInVector);
                String sortedT = String.valueOf(tInVector);
                
                if (sortedS.equals(sortedT)) {
                    anagramList.add(strList.get(j));
                    anagramSet.add(j);
                }
            }

            output.add(anagramList);
        }

        return output;
    }
}
