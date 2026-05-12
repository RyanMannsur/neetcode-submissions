class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<String> strList = Arrays.asList(strs);
        Map<String, List<String>> strMap = new HashMap<>();

        List<List<String>> output = new ArrayList<>();
        for (int i=0; i<strList.size(); i++) {

            List<String> anagramList = new ArrayList<>();

            char[] sInVector = strList.get(i).toCharArray();
            Arrays.sort(sInVector);
            String sortedS = String.valueOf(sInVector);
            strMap.put(sortedS, new ArrayList<>());
        }
        
        for (int i=0;i<strList.size(); i++) {

            char[] sInVector = strList.get(i).toCharArray();
            Arrays.sort(sInVector);
            String sortedS = String.valueOf(sInVector);

            List<String> listOnMap = strMap.get(sortedS);
            listOnMap.add(strList.get(i));
        }
          
        return new ArrayList<>(strMap.values());
    }
}